class Solution {
    public boolean halvesAreAlike(String s) {
        int midpoint = s.length() / 2;
        String a = s.substring(0, midpoint);
        String b = s.substring(midpoint);

        int counta = 0;
        int countb = 0;
        for(int i = 0;i<a.length();i++){
            char ch = a.charAt(i);
            if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'){
                counta++;
            }
            if(ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U'){
                counta++;
            }
        }
        for(int i = 0;i<b.length();i++){
            char ch = b.charAt(i);
            if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'){
                countb++;
            }
            if(ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U'){
                countb++;
            }
        }
        if(counta == countb) return true;
        return false ;
    }
}
