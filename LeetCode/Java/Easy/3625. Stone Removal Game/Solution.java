class Solution {
    public boolean canAliceWin(int n) {
        if (n < 10) return false;
        
        for (int i = 10; i > 0; i--) {
            if (n < i) {
                return i % 2 == 1; 
            }
            n -= i;
        }
        
        return false;
    }
}
