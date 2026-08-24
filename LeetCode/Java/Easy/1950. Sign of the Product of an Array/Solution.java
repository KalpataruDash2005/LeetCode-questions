class Solution {
    public int arraySign(int[] nums) {
        double pro = 1;
        for(int i = 0 ; i < nums.length ; i++){
            pro = pro * nums[i];
            if (nums[i] == 0) {
                return 0; 
            }
        }
        if(pro > 0){
            return 1;
        } else {
            return -1;
        }
    }
}