class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int leftSum = 0, rightSum = 0;
        int leftQuestion = 0, rightQuestion = 0;

        for (int i = 0; i < n / 2; i++) {
            if (num.charAt(i) == '?') {
                leftQuestion++;
            } else {
                leftSum += num.charAt(i) - '0';
            }
        }

        for (int i = n / 2; i < n; i++) {
            if (num.charAt(i) == '?') {
                rightQuestion++;
            } else {
                rightSum += num.charAt(i) - '0';
            }
        }

        if ((leftQuestion + rightQuestion) % 2 != 0) {
            return true;
        }

        return (leftSum - rightSum) != (rightQuestion - leftQuestion) * 9 / 2;
    }
}
