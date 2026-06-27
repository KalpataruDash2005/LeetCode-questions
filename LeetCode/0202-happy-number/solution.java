class Solution {
    public boolean isHappy(int n) {
        if(n==1 || n==7) return true;
        while(n>=10){
        int digitsum = 0;
            while(n!=0){
                int rem = n%10;
                digitsum += rem * rem;
                n/=10;
            }
            n = digitsum;
            if(n==1 || n==7) return true;
        }
        return false ;
    }
}
