class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftSum[] = new int[nums.length];
        int rightSum[] = new int[nums.length];
        int result[] = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        int sum=0;
        for(int i = 1 ; i< nums.length ; i++){
            sum += nums[i-1]; 
            leftSum[i] = sum ;
        }
        sum = 0;
        for(int i = nums.length-2; i>=0 ; i--){
            sum += nums[i+1];
            rightSum[i] = sum ; 
        }
        for(int i = 0; i<nums.length ; i++){
            result[i] = Math.abs(leftSum[i]-rightSum[i]);
        }
        return result;
    }
}
