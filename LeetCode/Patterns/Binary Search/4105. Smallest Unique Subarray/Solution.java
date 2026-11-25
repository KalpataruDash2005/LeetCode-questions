import java.util.HashMap;
import java.util.Map;

class Solution {
    private static final long BASE = 100003L;
    private static final long MOD1 = 1_000_000_007L;
    private static final long MOD2 = 1_000_000_009L;

    private long[] pow1, pow2, pref1, pref2;

    public int smallestUniqueSubarray(int[] nums) {
        int n = nums.length;
        pow1 = new long[n + 1];
        pow2 = new long[n + 1];
        pref1 = new long[n + 1];
        pref2 = new long[n + 1];

        pow1[0] = 1;
        pow2[0] = 1;

        for (int i = 0; i < n; i++) {
            pow1[i + 1] = (pow1[i] * BASE) % MOD1;
            pow2[i + 1] = (pow2[i] * BASE) % MOD2;
            pref1[i + 1] = (pref1[i] * BASE + nums[i]) % MOD1;
            pref2[i + 1] = (pref2[i] * BASE + nums[i]) % MOD2;
        }

        int lo = 1, hi = n, ans = n;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (hasUniqueOfLen(n, mid)) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    private long getHash(int l, int r) {
        int len = r - l;
        long h1 = (pref1[r] - (pref1[l] * pow1[len]) % MOD1 + MOD1) % MOD1;
        long h2 = (pref2[r] - (pref2[l] * pow2[len]) % MOD2 + MOD2) % MOD2;
        // Pack two 32-bit hashes into one 64-bit long key
        return (h1 << 32) | h2;
    }

    private boolean hasUniqueOfLen(int n, int len) {
        int totalWindows = n - len + 1;
        Map<Long, Integer> counts = new HashMap<>(totalWindows * 2);

        for (int i = 0; i < totalWindows; i++) {
            long h = getHash(i, i + len);
            counts.merge(h, 1, Integer::sum);
        }

        for (int count : counts.values()) {
            if (count == 1) {
                return true;
            }
        }
        return false;
    }
}
