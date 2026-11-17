import java.util.*;

class Solution {
    public int minimumChanges(String s, int k) {
        int n = s.length();
        int INF = 1_000_000_000;

        List<Integer>[] divisors = new ArrayList[n + 1];
        for (int len = 2; len <= n; len++) {
            divisors[len] = new ArrayList<>();
            for (int d = 1; d < len; d++) {
                if (len % d == 0) {
                    divisors[len].add(d);
                }
            }
        }

        int[][] cost = new int[n][n];
        for (int[] row : cost) {
            Arrays.fill(row, INF);
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int len = j - i + 1;
                int minChanges = INF;

                for (int d : divisors[len]) {
                    int changes = 0;
                    for (int start = 0; start < d; start++) {
                        int left = i + start;
                        int right = j - (d - 1 - start);
                        while (left < right) {
                            if (s.charAt(left) != s.charAt(right)) {
                                changes++;
                            }
                            left += d;
                            right -= d;
                        }
                    }
                    minChanges = Math.min(minChanges, changes);
                }
                cost[i][j] = minChanges;
            }
        }

        int[][] dp = new int[n + 1][k + 1];
        for (int[] row : dp) {
            Arrays.fill(row, INF);
        }
        dp[0][0] = 0;

        for (int p = 1; p <= k; p++) {
            for (int i = 2 * p; i <= n; i++) {
                for (int m = 2 * (p - 1); m <= i - 2; m++) {
                    if (dp[m][p - 1] != INF) {
                        dp[i][p] = Math.min(dp[i][p], dp[m][p - 1] + cost[m][i - 1]);
                    }
                }
            }
        }

        return dp[n][k];
    }
}
