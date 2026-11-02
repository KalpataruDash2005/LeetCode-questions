class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int [] res = new int [nums.length];
        int i = 0;
        while(i < nums.length){
            int j = 0;
            while(j < nums.length){
                res[i] += Math.abs(nums[i]-nums[j]);
                j++;
            }
            i++;
        }
        return res;
    }
}