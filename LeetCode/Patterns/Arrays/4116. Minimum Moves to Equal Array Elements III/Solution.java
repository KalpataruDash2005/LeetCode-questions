class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length;i++){
           max = Math.max(max,nums[i]);
        }
        int chances = 0;
        int ans = 0;
        for(int i = 0 ; i<nums.length ;i++){
            chances = max-nums[i];
            ans+=chances;
        }
        return ans;
    }
}