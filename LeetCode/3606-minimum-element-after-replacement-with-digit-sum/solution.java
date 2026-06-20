class Solution {
    public int minElement(int[] nums) {
        int arr[] = new int[nums.length];
        int num =0 , min = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length;i++){
            num=0;
            while(nums[i]!=0){
            int rem = nums[i]%10;
            num += rem;
            nums[i]/=10;
            }
            arr[i] = num;
        }
        for(int i = 0; i<nums.length;i++){
           if(arr[i]<min){
            min = arr[i];
           }
        }
        return min; 
    }
}
