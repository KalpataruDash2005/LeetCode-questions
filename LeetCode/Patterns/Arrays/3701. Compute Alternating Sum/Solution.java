class Solution { 
    public int alternatingSum(int[] nums) { 
        int sum = 0;
        int even = 0; 
        int odd = 1; 
        
        while (even < nums.length || odd < nums.length) {
            if (even < nums.length) {
                sum += nums[even];
                even += 2;
            }
            if (odd < nums.length) {
                sum -= nums[odd];
                odd += 2;
            }
        }
        return sum;
    } 
}
