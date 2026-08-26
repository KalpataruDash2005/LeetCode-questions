class Solution { 
    public long maximumSubarraySum(int[] nums, int k) { 
        long ans = 0; 
        long sum = 0;

        for (int i = 0; i <= nums.length - k; i++) {

            if (nums[i] != nums[i + 1] &&
                nums[i] != nums[i + 2] &&
                nums[i + 1] != nums[i + 2]) {

                sum = (long) nums[i] + nums[i + 1] + nums[i + 2];
                ans = Math.max(ans, sum);
            }
        }

        return ans;
    } 
}