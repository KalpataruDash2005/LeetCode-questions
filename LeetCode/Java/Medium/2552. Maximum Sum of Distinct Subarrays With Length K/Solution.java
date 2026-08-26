class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        long ans = 0;

        int[] freq = new int[100001];

        for (int i = 0; i < k; i++) {
            sum += nums[i];
            freq[nums[i]]++;
        }

        if (getDistinct(freq, nums, 0, k) == k) {
            ans = sum;
        }

        for (int i = k; i < nums.length; i++) {

            sum += nums[i];
            sum -= nums[i - k];

            freq[nums[i]]++;
            freq[nums[i - k]]--;

            if (getDistinct(freq, nums, i - k + 1, i + 1) == k) {
                ans = Math.max(ans, sum);
            }
        }

        return ans;
    }

    private int getDistinct(int[] freq, int[] nums, int left, int right) {
        int count = 0;

        for (int i = left; i < right; i++) {
            if (freq[nums[i]] == 1) {
                count++;
            }
        }

        return count;
    }
}