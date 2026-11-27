import java.util.Arrays;

class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;
        int[] bonus = new int[n];
        int minPrice = Integer.MAX_VALUE;
        int maxVal = 0;

        for (int i = 0; i < n; i++) {
            int fi = items[i][0];
            minPrice = Math.min(minPrice, items[i][1]);
            for (int j = 0; j < n; j++) {
                if (i != j && items[j][0] % fi == 0) {
                    bonus[i]++;
                }
            }
            maxVal += 1 + bonus[i];
        }

        int[] dp = new int[maxVal + 1];
        Arrays.fill(dp, budget + 1);
        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            int price = items[i][1];
            int val = 1 + bonus[i];
            if (price <= budget) {
                for (int curV = maxVal - val; curV >= 0; curV--) {
                    if (dp[curV] + price < dp[curV + val]) {
                        dp[curV + val] = dp[curV] + price;
                    }
                }
            }
        }

        int ans = 0;
        for (int v = 0; v <= maxVal; v++) {
            if (dp[v] <= budget) {
                int extra = (budget - dp[v]) / minPrice;
                ans = Math.max(ans, v + extra);
            }
        }

        return ans;
    }
}
