
class Solution {
    public int thirdMax(int[] nums) {
        Long fmax = null;
        Long smax = null;
        Long tmax = null;

        for (int num : nums) {
            long n = num;

            if (fmax != null && n == fmax ||
                smax != null && n == smax ||
                tmax != null && n == tmax) {
                continue;
            }

            if (fmax == null || n > fmax) {
                tmax = smax;
                smax = fmax;
                fmax = n;
            } 
            else if (smax == null || n > smax) {
                tmax = smax;
                smax = n;
            } 
            else if (tmax == null || n > tmax) {
                tmax = n;
            }
        }

        return (tmax == null ? fmax : tmax).intValue();
    }
}
