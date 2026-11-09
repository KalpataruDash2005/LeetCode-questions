import java.util.*;

class Solution {
    public List<Integer> busiestServers(int k, int[] arrival, int[] load) {

        TreeSet<Integer> available = new TreeSet<>();

        // Initially, all servers are available
        for (int i = 0; i < k; i++) {
            available.add(i);
        }

        // {completionTime, serverId}
        PriorityQueue<int[]> busy = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0], b[0])
        );

        int[] count = new int[k];

        for (int i = 0; i < arrival.length; i++) {

            // 1. Release servers that have completed their requests
            while (!busy.isEmpty() && busy.peek()[0] <= arrival[i]) {
                int[] completed = busy.poll();
                available.add(completed[1]);
            }

            // 2. Drop request if all servers are busy
            if (available.isEmpty()) {
                continue;
            }

            // 3. Find preferred server
            int preferred = i % k;

            Integer server = available.ceiling(preferred);

            // 4. Wrap around if necessary
            if (server == null) {
                server = available.first();
            }

            // 5. Assign request
            available.remove(server);

            count[server]++;

            int completionTime = arrival[i] + load[i];

            busy.offer(new int[]{completionTime, server});
        }

        // 6. Find maximum number of requests
        int max = 0;

        for (int requests : count) {
            max = Math.max(max, requests);
        }

        // 7. Collect busiest servers
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            if (count[i] == max) {
                result.add(i);
            }
        }

        return result;
    }
}