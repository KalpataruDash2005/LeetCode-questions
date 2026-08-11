class Solution {
    public int time(int mid , int[] nums){
        int t = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]%mid == 0){
                t += nums[i]/mid;
            }else{
                t+= (nums[i]/mid)+1;
            }
        }
        return t;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int ans = 0;
        int low = 1;
        int high = nums[0];
        for(int i = 0 ; i<nums.length;i++){
            if(nums[i]>high){
                high = nums[i];
            }
        }
        while(low < high){
            int mid = low + (high - low)/2;
            ans = time(mid , nums);
            if(ans <= threshold){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return low;   
    }
}

