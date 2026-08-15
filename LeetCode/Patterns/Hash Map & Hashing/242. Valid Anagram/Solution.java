class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];

        for(int i = 0; i<s.length() ; i++){
            char ch = s.charAt(i);
            freq[ch-'a']++;
        }

        for(int i = 0; i<t.length() ; i++){
            char ch = t.charAt(i);
            freq[ch-'a']--;
        }

        int length = Math.max(t.length(),s.length());

        for(int i = 0; i<length; i++){
           if(freq[i]!=0){
            return false;
           }
        }

        return true;
    }
}