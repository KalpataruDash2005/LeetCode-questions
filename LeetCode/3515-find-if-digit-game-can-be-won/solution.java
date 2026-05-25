class Solution {
    public boolean canAliceWin(int[] nums) {
        int Ssum =0 , Lsum =0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<10){
                Ssum+=nums[i];
            } else{
                Lsum+=nums[i];
            }
        }
        
         if(Ssum==Lsum){
            return false;
        }
        else{
            return true;
        }
    }
}
