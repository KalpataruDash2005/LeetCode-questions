import java.util.*;

class Solution {
    public int[] assignTasks(int[] servers, int[] tasks) {
        int n = servers.length;
        int m = tasks.length;

        PriorityQueue<int[]> available = new PriorityQueue<>(
            (a, b) -> {
                if (a[0] != b[0])
                    return Integer.compare(a[0], b[0]);
                return Integer.compare(a[1], b[1]);
            }
        );

        PriorityQueue<long[]> busy = new PriorityQueue<>(
            (a, b) -> {
                if (a[0] != b[0])
                    return Long.compare(a[0], b[0]);
                if (a[1] != b[1])
                    return Long.compare(a[1], b[1]);
                return Long.compare(a[2], b[2]);
            }
        );

        for (int i = 0; i < n; i++) {
            available.offer(new int[]{servers[i], i});
        }

        int[] ans = new int[m];
        long currentTime = 0;

        for (int i = 0; i < m; i++) {
            currentTime = Math.max(currentTime, i);

            while (!busy.isEmpty() && busy.peek()[0] <= currentTime) {
                long[] s = busy.poll();
                available.offer(new int[]{(int) s[1], (int) s[2]});
            }

            if (available.isEmpty()) {
                currentTime = busy.peek()[0];

                while (!busy.isEmpty() && busy.peek()[0] <= currentTime) {
                    long[] s = busy.poll();
                    available.offer(new int[]{(int) s[1], (int) s[2]});
                }
            }

            int[] server = available.poll();

            ans[i] = server[1];

            busy.offer(new long[]{
                currentTime + tasks[i],
                server[0],
                server[1]
            });
        }

        return ans;
    }
}