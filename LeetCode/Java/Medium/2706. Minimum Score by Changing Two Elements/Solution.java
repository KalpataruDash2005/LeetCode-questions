import java.util.Arrays;

class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        
        int changeTwoMins = nums[n - 1] - nums[2];
        int changeTwoMaxs = nums[n - 3] - nums[0];
        int changeMinAndMax = nums[n - 2] - nums[1];
        
        return Math.min(changeTwoMins, Math.min(changeTwoMaxs, changeMinAndMax));
    }
}
