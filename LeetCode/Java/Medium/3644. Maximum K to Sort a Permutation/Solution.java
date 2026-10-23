class Solution {
    public int sortPermutation(int[] nums) {
        int k = 0;
        while(k < nums.length){
            int a = nums[k];
            int b = nums[a];

            if(a != b){
                return k;
            }
            k++;
        }
        return 0;
    }
}