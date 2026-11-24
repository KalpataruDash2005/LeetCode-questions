class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        long maxLcm = 1;
        int maxVal = 0;

        for (int x : nums) {
            maxLcm = lcm(maxLcm, x);
            maxVal = Math.max(maxVal, x);
        }

        long limit = maxLcm * maxVal;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            long prod = 1;
            long g = 0;
            long l = 1;

            for (int j = i; j < n; j++) {
                prod *= nums[j];
                g = gcd(g, nums[j]);
                l = lcm(l, nums[j]);

                if (prod == l * g) {
                    ans = Math.max(ans, j - i + 1);
                }
                if (prod > limit) {
                    break;
                }
            }
        }

        return ans;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }
}
