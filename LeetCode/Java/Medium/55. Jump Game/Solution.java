class Solution {
    public boolean canJump(int[] nums) {
        int jump = nums[0];
        int ind = 0;
        
        for(int i = 0 ; i < nums.length ; i++){
            if (i > ind) return false; 
            ind = Math.max(ind, i + nums[i]);
        }
        
        if(ind < nums.length - 1) return false;
        return true;
    }
}
