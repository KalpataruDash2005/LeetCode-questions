class Solution { 
    public long maximumSubarraySum(int[] nums, int k) { 
        long ans = 0; 
        long sum = 0; 
        for(int i = 0 ; i<nums.length-2;i++){
            if(nums[i] != nums[i+1] && nums[i+1] != nums[i+2] && nums[i] != nums[i+2]){
                sum = nums[i] + nums[i+1] + nums[i+2];
                ans = sum;
            }
        }
        ans = Math.max(ans,sum);
        return ans;
    } 
}
