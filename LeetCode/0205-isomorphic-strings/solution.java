class Solution {
    public boolean isIsomorphic(String s, String t) {
        int [] fres = new int[128];
        int [] fret = new int[128];
        for(int i = 0 ; i<s.length();i++){
             char chs = s.charAt(i);
             char cht = t.charAt(i);

             if(fres[chs] != fret[cht]) {
                return false;
             }
             fres[chs] = i+1;
             fret[cht] = i+1;
        }
        return true;
    }
}
