class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length , sum1=0 , sum2=0;
        sum1 = n*(n+1)/2;
        for(int i = 0;i<=nums.length-1;i++){
            sum2+=nums[i];
        }
        return sum1-sum2;
    }
}
