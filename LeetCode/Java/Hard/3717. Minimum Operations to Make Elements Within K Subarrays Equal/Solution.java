import java.util.Arrays;

class Solution {
    public long minOperations(int[] nums, int x, int k) {
        int n = nums.length;
        int m = n - x + 1;
        if (m <= 0 || k * x > n) return -1;

        long[] cost = new long[m];
        
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

        Long[][] dp = new Long[m][k + 1];
        
        return findMinimum(cost, 0, x, k, dp);
    }

    private long findMinimum(long[] cost, int i, int x, int remaining, Long[][] dp) {
        if (remaining == 0) {
            return 0;
        }
        if (i >= cost.length || cost.length - i < remaining) {
            return Long.MAX_VALUE / 2;
        }
        
        if (dp[i][remaining] != null) {
            return dp[i][remaining];
        }

        long skip = findMinimum(cost, i + 1, x, remaining, dp);
        long select = cost[i] + findMinimum(cost, i + x, x, remaining - 1, dp);

        return dp[i][remaining] = Math.min(skip, select);
    }
}
