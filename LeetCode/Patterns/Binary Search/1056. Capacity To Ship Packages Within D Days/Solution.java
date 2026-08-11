class Solution {
    public int capacity(int mid , int[] weights){
        int days =1;
        int capacityy = 0;
        for(int i =0 ; i<weights.length ; i++){
            if(capacityy+weights[i] > mid){
               days++;
               capacityy = weights[i];
            } else{
                capacityy += weights[i]; 
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int ans1 = 0;
        int low = weights[0];
        int high = 0;
        for(int i = 0; i<weights.length ; i++ ){
            if(weights[i] > low){
                low = weights[i];
            }
            high += weights[i];
        }
        ans1 = high;
        while(low <= high){
            int mid = low + (high - low)/2;
            int ans = capacity(mid , weights);
            if(ans <= days){
                ans1 = mid;
                high = mid - 1;
            }else{
                low = mid+1;
            }
        }
        return ans1;
    }
}