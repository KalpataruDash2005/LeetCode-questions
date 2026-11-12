class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inlen = 1 , drlen = 1;
        int max = 1;
        for(int i = 1 ; i < nums.length; i++){
            if(nums[i] < nums[i-1]){
                inlen+=1;
                drlen =1;
            }else if(nums[i] > nums[i-1]){
                drlen+=1;
                inlen =1;
            }else{
                drlen =1;
                inlen =1;
            }
            max = Math.max(max,Math.max(inlen,drlen));
        }
        return max;
    }
}