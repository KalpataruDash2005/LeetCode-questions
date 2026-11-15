class Solution {
    public int numOfSubarrays(int[] arr) {
        int MOD = 1_000_000_007;
        int ans = 0;
        int prefixSum = 0;

        for (int right = 0; right < arr.length; right++) {
            prefixSum += arr[right];
            
            // Start a temporary sum from the full prefix [0...right]
            int currentSum = prefixSum;
            int left = 0;

            // Shrink from left up to right to check every subarray ending at right
            while (left <= right) {
                if (currentSum % 2 != 0) {
                    ans = (ans + 1) % MOD;
                }
                currentSum -= arr[left];
                left++;
            }
        }
        return ans;
    }
}
