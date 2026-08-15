class Solution {
    public void swap(char[] s , int st , int end){
        while(st<end){
            char temp = s[st];
            s[st] = s[end];
            s[end] = temp;
            st++;
            end--; 
        }
    }
    public void reverseString(char[] s) {
        int  st = 0 ;
        int end = s.length-1;
        swap(s , st , end);
    }
}