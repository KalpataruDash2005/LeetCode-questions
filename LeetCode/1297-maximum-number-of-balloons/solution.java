class Solution {
    public int maxNumberOfBalloons(String text) {
        int countb = 0 , counta = 0 , countl = 0 , counto = 0 , countn = 0;
        int result = Integer.MAX_VALUE;
         for(int i = 0;i<text.length() ;i++){
            char c = text.charAt(i);
            if(c == 'b') countb++;
            if(c == 'a') counta++;
            if(c == 'l') countl++;
            if(c == 'o') counto++;
            if(c == 'n') countn++;
         }
        if(countb>=1 && counta>=1 && countl>=2 && counto>=2 && countn>=1){
            result = Math.min(result,countb);
            result = Math.min(result,counta);
            result = Math.min(result,countl/2);
            result = Math.min(result,counto/2);
            result = Math.min(result,countn);
        }
        if(result == Integer.MAX_VALUE) return 0;
        return result;
    }
}
