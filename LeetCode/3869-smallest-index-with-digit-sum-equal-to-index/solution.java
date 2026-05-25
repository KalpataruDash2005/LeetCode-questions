class Solution {
    public int smallestIndex(int[] nums) {
       for(int i = 0;i<nums.length;i++){
       int sum =0; 
        if(nums[i]<10){
            if(nums[i]==i){
                return i;
            }
        }else{
          int num = nums[i];
          while(num!=0){
          int rem = num%10;
          sum +=rem;
          num/=10;
          }  
          if(sum == i){
            return i;
          }
        }
          
       }
       return -1;
    }
}
