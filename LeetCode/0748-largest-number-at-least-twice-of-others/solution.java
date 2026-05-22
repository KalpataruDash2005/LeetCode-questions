class Solution {
    public int dominantIndex(int[] nums) {
        int large =0 , sdlarge =0 , largeIndex =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>large){
                sdlarge = large ;
                large = nums[i];
                largeIndex =i;
            } else if(nums[i]>sdlarge && nums[i]<large){
                sdlarge=nums[i];
            }
        }
        if (large >= sdlarge * 2) {
            return largeIndex;
        }
        return -1;
    }
}


