class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int ld =0;
        int rn = 0;
        int dup = x;
        while(x!=0){
            ld = x%10;
            rn = (rn*10)+ld;
            x = x/10;
        }
        if(dup == rn) {
            return true ;
        }
        return false;
    }
}
