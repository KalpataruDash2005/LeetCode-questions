class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int idx = 0;
        int n = words.length;
        int ans = -1;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                idx = i;

                int diff = Math.abs(startIndex - idx);
                int diff2 = n - diff;

                int minDis = Math.min(diff, diff2);

                if (ans == -1 || minDis < ans) {
                    ans = minDis;
                }
            }
        }

        return ans;
    }
}
