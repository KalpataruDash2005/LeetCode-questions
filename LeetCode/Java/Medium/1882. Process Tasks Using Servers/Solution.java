import java.util.*;

class Solution {
    public int[] assignTasks(int[] servers, int[] tasks) {
        int n = servers.length;
        int m = tasks.length;

        PriorityQueue<int[]> free = new PriorityQueue<>(
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
            free.offer(new int[]{servers[i], i});
        }

        int[] ans = new int[m];

        for (int i = 0; i < m; i++) {
            long time = i;

            if (free.isEmpty()) {
                time = busy.peek()[0];
            }

            while (!busy.isEmpty() && busy.peek()[0] <= time) {
                long[] s = busy.poll();
                free.offer(new int[]{(int) s[1], (int) s[2]});
            }

            int[] server = free.poll();

            ans[i] = server[1];

            busy.offer(new long[]{
                time + tasks[i],
                server[0],
                server[1]
            });
        }

        return ans;
    }
}