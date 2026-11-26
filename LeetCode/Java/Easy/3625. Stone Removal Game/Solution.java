class Solution {
    public boolean canAliceWin(int n) {
        if(n < 10) return false;
        for(int i = 10 ; i>0;i--){
            int num = n-i;
            if(num > i){
                return true;
            }
        }
        return false;
    }
}