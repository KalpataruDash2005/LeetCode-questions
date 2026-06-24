class Solution {
    public int singleNumber(int[] nums) {
       int n = nums.length;
       int uninum = 0;
       for(int i = 0;i< n;i++){
        uninum ^= nums[i];
       }
       return uninum;
    }
}

