class Solution {
    public long sumAndMultiply(int n) {
        if(n==0) return 0;
        long sum = 0  , num = 0;
        while(n!=0){
            long rem = n%10;
            if(rem != 0) {
                num = (num*10)+rem;
                sum +=rem;
            }
             n/=10;
        }
        long num1 = 0;
        while (num != 0) {
            long digit = num % 10;      
            num1 = num1 * 10 + digit; 
            num /= 10;                 
        }
        return num1*sum;
    }
}
