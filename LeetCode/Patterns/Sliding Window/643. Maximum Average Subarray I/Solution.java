class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int left = 0;
       
        for(int i = 0 ; i<k ; i++){
            sum+=nums[i];
        }
        int ans = sum;
        for(int i = k ; i<nums.length;i++){
            sum+= nums[i];
            sum-=nums[left];
            left++;

            ans = Math.max(ans , sum);
           
        }
        return (double) ans/k;
    }
}