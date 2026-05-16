class Solution {
    public boolean isPowerOfThree(int n) {
        int i = 0;
        if(n<=0) return false;
        while(Math.pow(3,i)<=n){
            if(n== Math.pow(3,i)) return true;
            i++;
        }
        return false;
    }
}
