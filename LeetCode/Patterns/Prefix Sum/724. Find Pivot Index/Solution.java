class Solution {
    public int pivotIndex(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int lsum = 0;
        int rsum = 0;
        while(left < right){
            if(rsum <= lsum){
                rsum+=nums[right];
                right--;
            }
            else {
                lsum += nums[left];
                left++;
            }
        }
        if(lsum == rsum){
            return left;
        }
        return -1;
    }
}