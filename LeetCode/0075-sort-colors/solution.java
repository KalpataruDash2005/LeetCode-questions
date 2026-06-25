class Solution {
    public void sortColors(int[] nums) {
      int left = 0;
      int right = nums.length-1;
      int itr = 0;
      while(itr<=right){
        if(nums[itr]==0){
            int temp = nums[itr];
            nums[itr] = nums[left];
            nums[left] = temp;
            itr++;
            left++;
        } 
        else if(nums[itr]==2){
            int temp = nums[itr];
            nums[itr] = nums[right];
            nums[right] = temp;
            right--;
        }
        else{
            itr++;
        }
      }
    }
}
