class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;
        
        // 1. Calculate the overall sum of the array
        for (int num : nums) {
            totalSum += num;
        }
        
        // 2. Scan from left to right to locate the pivot
        for (int i = 0; i < nums.length; i++) {
            // Right sum = total sum minus left sum minus the current element
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i; // Returns the leftmost valid index immediately
            }
            leftSum += nums[i];
        }
        
        return -1;
    }
}
