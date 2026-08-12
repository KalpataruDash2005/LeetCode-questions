class Solution {
    public int mySqrt(int x) {
        int low = 1;
        int high = x;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(mid > low){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}