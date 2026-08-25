class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int pro = k;
        int ans = 0;
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i] == pro){
                pro += k;
            }
        }
        return pro;
    }
}