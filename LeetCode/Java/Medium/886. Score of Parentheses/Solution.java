class Solution {
    public int scoreOfParentheses(String s) {
        int i = 0;
        int count = 0;
        while(i < s.length()){
           if(s.charAt(i) == '('){
             count++;
           }
           i++;
        }
        return count;
    }
}