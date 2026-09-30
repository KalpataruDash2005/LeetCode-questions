class Solution {
    static int helper(int []arr , int left , int right){
        if(left >= right) return left;
        int mid = left + (right-left)/2;
        if(arr[mid] < arr[mid+1]){
           return helper(arr , mid+1 , right);
        }else{
           return helper(arr , left , mid);
        }
    }
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        int ans = helper(arr , left , right);
        return ans;
    }
}