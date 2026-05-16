class Solution {
    public int fib(int n) {
        int a=0 , b=1 , temp=0 ;
       if(n==0) return 0;
       for(int i = 1 ; i<=n ;i++){
        temp = b;
         b= a+b;
         a = temp;
       }
        return a;
    }
}
