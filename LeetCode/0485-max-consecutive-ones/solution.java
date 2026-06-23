class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      int n = nums.length , count=0 , maxcount = 0;
      for(int i = 0 ; i<n ;i++){
        if(nums[i]==1){
            count++;
            if(count > maxcount){
                maxcount = count;
            }
        }
         else{
                count = 0;
            }
      }
      return maxcount; 
    }
}
