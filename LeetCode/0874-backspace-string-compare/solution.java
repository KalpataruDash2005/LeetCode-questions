class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder st = new StringBuilder(s);
        StringBuilder ts = new StringBuilder(t);

        for(int i = 0;i<st.length();i++){
            if(st.charAt(i)=='#'){
                if(i>0){
                    st.deleteCharAt(i);
                    st.deleteCharAt(i-1);
                    i-=2;
                }else {
                    st.deleteCharAt(i);
                    i--;
                }
            }
        }
        for(int i = 0;i<ts.length();i++){
            if(ts.charAt(i)=='#'){
                 if(i>0){
                    ts.deleteCharAt(i);
                    ts.deleteCharAt(i-1);
                    i-=2;
                }else {
                    ts.deleteCharAt(i);
                    i--;
                }
            }
        }
        return st.toString().equals(ts.toString());
    }
}
