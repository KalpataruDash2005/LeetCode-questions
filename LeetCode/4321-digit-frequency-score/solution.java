class Solution {
    public int digitFrequencyScore(int n) {
        int res = 0;
        while(n!=0){
            int rem = n%10;
            res+=rem;
            n/=10;
        }
        return res;
    }
}
