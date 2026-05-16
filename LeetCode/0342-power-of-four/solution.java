class Solution {
    public boolean isPowerOfFour(int n) {
      if(n<=0) return false;
      int i = 0;
      while(n>=Math.pow(4,i)){
        if(n==Math.pow(4,i)) return true;
        i++;
      }
      return false;
    }
}
