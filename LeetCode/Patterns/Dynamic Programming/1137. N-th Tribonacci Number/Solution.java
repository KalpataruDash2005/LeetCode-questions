class Solution {
    public int tribonacci(int n) {
        return trifib(n,0,1,1);
    }
    public int trifib(int n,int a,int b,int c){
        if(n==0) return a;
        return trifib(n-1,b,c,a+b+c);
    }
}