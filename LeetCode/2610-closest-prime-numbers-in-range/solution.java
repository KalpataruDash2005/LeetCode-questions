class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[] prime = new boolean[right+1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for (int i = 2; i * i <= right; i++)
            if (prime[i])
        for (int j = i * i; j <= right; j += i) prime[j] = false;
        int pre = -1, d = Integer.MAX_VALUE, r1 = -1, r2 = -1;
        for (int i = Math.max(2, left); i <= right; i++) {
            if (prime[i]) {
                if (pre != -1 && i - pre < d) {
                    d = i - pre;
                    r1 = pre;
                    r2 = i;
                }
                pre = i;
            }
        }
        return new int[]{r1, r2};
    }
}
