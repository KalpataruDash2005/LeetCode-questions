import java.util.*;

class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;
        int[] freq = new int[n + 1];
        for (int[] item : items) {
            freq[item[0]]++;
        }

        // mult[x] = number of items whose factor is a multiple of x
        int[] mult = new int[n + 1];
        for (int x = 1; x <= n; x++) {
            if (freq[x] > 0) {
                for (int multiple = x; multiple <= n; multiple += x) {
                    mult[x] += freq[multiple];
                }
            }
        }

        // Pair each item with its price and d_i = number of 2-item copies it can provide
        long[][] sorted = new long[n][2]; // [price, d_i]
        for (int i = 0; i < n; i++) {
            sorted[i][0] = items[i][1];
            sorted[i][1] = mult[items[i][0]] - 1L;
        }

        // Sort by price ascending
        Arrays.sort(sorted, Comparator.comparingLong(a -> a[0]));

        long minPrice = sorted[0][0];
        long rem = budget;
        long totalItems = 0;
        long ans = rem / minPrice;

        for (int i = 0; i < n; i++) {
            long price = sorted[i][0];
            long d = sorted[i][1];

            if (d <= 0 || rem < price) {
                continue;
            }
            if (price >= 2 * minPrice) {
                break;
            }

            long take = Math.min(d, rem / price);

            // Check boundary: taking (take - 1) copies and filling the rest with minPrice
            if (take >= 1) {
                long itemsMinusOne = totalItems + (take - 1) * 2;
                long remMinusOne = rem - (take - 1) * price;
                ans = Math.max(ans, itemsMinusOne + remMinusOne / minPrice);
            }

            totalItems += take * 2;
            rem -= take * price;
            ans = Math.max(ans, totalItems + rem / minPrice);
        }

        return (int) ans;
    }
}
