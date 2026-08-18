class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        if (k == n) {
            int max = nums[0];
            for (int i = 1; i < n; i++) {
                max = Math.max(max, nums[i]);
            }
            return max;
        }
        if (k == 1) {
            retu
        }
        int first = nums[0];
        int last = nums[n - 1];
        int countFirst = 0;
        int countLast = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == first) {
                countFirst++;
            }
            if (nums[i] == last) {
                countLast++;
            }
        }
        int ans = -1;
        if (countFirst == 1) {
            ans = Math.max(ans, first);
        }
        if (countLast == 1) {
            ans = Math.max(ans, last);
        }
        return ans;
    }
}