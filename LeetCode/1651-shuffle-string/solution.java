class Solution {
    public String restoreString(String s, int[] indices) {
        char [] c = s.toCharArray();
        for(int i = 0;i<s.length();i++){
            c[indices[i]] = s.charAt(i); 
        }
        String str = new String(c);
        return str;
        
    }
}
