class Solution {
    public boolean judgeCircle(String moves) {
       int up = 1;
       int down = -1;
       int left = 1;
       int right = -1;
       int movelr = 0;
       int movetb = 0;
       for(int i = 0 ; i<moves.length() ; i++){
          if(moves.charAt(i) == 'L'){
            movelr += left;
          }else if(moves.charAt(i) == 'R'){
            movelr += right;
          }else if(moves.charAt(i) == 'U'){
            movetb += up;
          }else{
            movetb += down;
          }
       }

       if(movelr == 0 && movetb == 0) return true;
       return false;
    }
}