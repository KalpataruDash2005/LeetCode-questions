import java.util.Arrays;

class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;
        int minPrice = Integer.MAX_VALUE;
        int maxFeature = 0;

        for (int[] item : items) {
            maxFeature = Math.max(maxFeature, item[0]);
            minPrice = Math.min(minPrice, item[1]);
        }

        int[] freq = new int[maxFeature + 1];
        for (int[] item : items) {
            freq[item[0]]++;
        }

        int[] multCount = new int[maxFeature + 1];
        for (int f = 1; f <= maxFeature; f++) {
            if (freq[f] > 0) {
                for (int multiple = f; multiple <= maxFeature; multiple += f) {
                    multCount[f] += freq[multiple];
                }
            }
        }

        int[] dp = new int[n * n + 1];
        Arrays.fill(dp, budget + 1);
        dp[0] = 0;
        int curMax = 0;

        for (int[] item : items) {
            int price = item[1];
            int val = multCount[item[0]];
            if (price <= budget && (long) price < (long) val * minPrice) {
                for (int curV = curMax; curV >= 0; curV--) {
                    if (dp[curV] + price < dp[curV + val]) {
                        dp[curV + val] = dp[curV] + price;
                        if (curV + val > curMax) {
                            curMax = curV + val;
                        }
                    }
                }
            }
        }

        int ans = 0;
        for (int v = 0; v <= curMax; v++) {
            if (dp[v] <= budget) {
                int extra = (budget - dp[v]) / minPrice;
                ans = Math.max(ans, v + extra);
            }
        }

        return ans;
    }
}
