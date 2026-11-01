class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int n = nums.length;
        for(int i = 0 ; i<n; i++){
            if(min > nums[i]){
                min = nums[i];
            }
            sum += nums[i];
        }
        return sum - min*n;
    }
}