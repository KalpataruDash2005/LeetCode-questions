class Solution {
    public int numOfSubarrays(int[] arr) {
        int MOD = 1_000_000_007;
        int ans = 0;
        int prefixSum = 0;
        
        // Start with evenCount = 1 to account for an empty prefix (sum = 0)
        int evenCount = 1; 
        int oddCount = 0;

        for (int num : arr) {
            prefixSum += num;

            if (prefixSum % 2 == 0) {
                // Even - Odd = Odd
                ans = (ans + oddCount) % MOD;
                evenCount++;
            } else {
                // Odd - Even = Odd
                ans = (ans + evenCount) % MOD;
                oddCount++;
            }
        }

        return ans;
    }
}
