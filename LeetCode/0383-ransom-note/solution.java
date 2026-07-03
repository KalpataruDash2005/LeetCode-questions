class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int [] fre = new int [26];
        for(int i = 0 ; i<magazine.length() ; i++ ){
            fre[magazine.charAt(i) - 'a']++;
        }

        for(int i = 0 ; i<ransomNote.length() ; i++ ){
            fre[ransomNote.charAt(i) - 'a']--;
            if(fre[ransomNote.charAt(i) - 'a']<0){
                return false;
            }
        }
        return true;
    }
}
