class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        long ans = 0;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < k; i++) {
            sum += nums[i];
            set.add(nums[i]);
        }

        if (set.size() == k) {
            ans = sum;
        }

        for (int i = k; i < nums.length; i++) {
            sum += nums[i];
            sum -= nums[i - k];

            set.remove(nums[i - k]);
            set.add(nums[i]);

            if (set.size() == k) {
                ans = Math.max(ans, sum);
            }
        }

        return ans;
    }
}