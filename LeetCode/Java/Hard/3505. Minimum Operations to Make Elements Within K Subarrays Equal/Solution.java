

class Solution {

    public long minOperations(int[] nums, int x, int k) {
        int n = nums.length;

        long[] cost = new long[n - x + 1];

        for (int i = 0; i <= n - x; i++) {
            int[] window = Arrays.copyOfRange(nums, i, i + x);

            Arrays.sort(window);

            int median = window[x / 2];

            long operations = 0;

            for (int num : window) {
                operations += Math.abs((long) num - median);
            }

            cost[i] = operations;
        }

        return findMinimum(cost, 0, x, k);
    }

    private long findMinimum(long[] cost, int i, int x, int remaining) {
        if (remaining == 0) {
            return 0;
        }

        if (i >= cost.length || cost.length - i < remaining) {
            return Long.MAX_VALUE / 2;
        }

        long skip = findMinimum(cost, i + 1, x, remaining);

        long select = cost[i] + findMinimum(
            cost, i + x, x, remaining - 1
        );

        return Math.min(skip, select);
    }
}