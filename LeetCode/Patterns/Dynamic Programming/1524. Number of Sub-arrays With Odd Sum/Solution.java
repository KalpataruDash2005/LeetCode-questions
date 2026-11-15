class Solution {
    public int numOfSubarrays(int[] arr) {
        int MOD = 1_000_000_007;
        int ans = 0;

        
        for (int left = 0; left < arr.length; left++) {

            int sum = 0; 
            int right = left;

    
            while (right < arr.length) {
                sum += arr[right];
                if (sum % 2 != 0) {
                    ans = (ans + 1) % MOD;
                }
                right++;
            }
        }
        return ans;
    }
}
