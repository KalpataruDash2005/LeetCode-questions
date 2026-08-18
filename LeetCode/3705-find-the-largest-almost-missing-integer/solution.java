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
        int ans = -1;
    for (int i = 0; i < n; i++) {
        int count = 0;
        for (int j = 0; j < n; j++) {
            if (nums[i] == nums[j]) {
                count++;
            }
        }
        if (count == 1) {
            ans = Math.max(ans, nums[i]);
        }
    }

    return ans;
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
