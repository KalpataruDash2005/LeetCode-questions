class Solution {
    public int arraySign(int[] nums) {
        int pro = 1;
        for(int i = 0 ; i < nums.length ; i++){
            pro = pro * nums[i];
        }
        if(pro == 0){
            return 0;
        }
        if(pro > 0){
            return 1;
        }
        return -1;
    }
}