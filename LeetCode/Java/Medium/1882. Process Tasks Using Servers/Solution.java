class Solution {
    public int[] assignTasks(int[] servers, int[] tasks) {
        int n = servers.length;
        int m = tasks.length;

        PriorityQueue<int[]> available = new PriorityQueue<>(
            (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]
        );

        PriorityQueue<int[]> busy = new PriorityQueue<>(
            (a, b) -> a[0] != b[0] ? a[0] - b[0] :
                      a[1] != b[1] ? a[1] - b[1] :
                      a[2] - b[2]
        );

        for (int i = 0; i < n; i++) {
            available.offer(new int[]{servers[i], i});
        }

        int[] ans = new int[m];

        for (int i = 0; i < m; i++) {

            while (!busy.isEmpty() && busy.peek()[0] <= i) {
                int[] server = busy.poll();
                available.offer(new int[]{server[1], server[2]});
            }

            if (available.isEmpty()) {
                int time = busy.peek()[0];

                while (!busy.isEmpty() && busy.peek()[0] == time) {
                    int[] server = busy.poll();
                    available.offer(new int[]{server[1], server[2]});
                }
            }

            int[] server = available.poll();

            ans[i] = server[1];

            busy.offer(new int[]{
                i + tasks[i],
                server[0],
                server[1]
            });
        }

        return ans;
    }
}