class Solution {
    public boolean judgeCircle(String moves) {
       int up = 1;
       int down = -1;
       int left = 1;
       int right = -1;
       int moved = 0;
       for(int i = 0 ; i<moves.length() ; i++){
          if(moves.charAt(i) == 'L'){
            moved += left;
          }else if(moves.charAt(i) == 'R'){
            moved += right;
          }else if(moves.charAt(i) == 'U'){
            moved += up;
          }else{
            moved += down;
          }
       }

       if(moved == 0 ) return true;
       return false;
    }
}