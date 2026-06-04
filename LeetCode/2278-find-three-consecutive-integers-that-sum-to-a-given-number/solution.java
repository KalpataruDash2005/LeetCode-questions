class Solution {
    public long[] sumOfThree(long num) {
      if(num%3!=0){
          return new long [0];
      }
      long t = (num/3)-1;

      return new long [] {t,t+1,t+2};
    }
}
