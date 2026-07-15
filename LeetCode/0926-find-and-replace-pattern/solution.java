import java.util.*;

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() != pattern.length()) continue;
            
            int[] fre1 = new int[26];
            int[] fre2 = new int[26];
            boolean isMatch = true;
            
            for (int j = 0; j < pattern.length(); j++) {
                char ch = pattern.charAt(j);
                char chs = words[i].charAt(j);
                
                if (fre1[ch - 'a'] == 0) {
                    fre1[ch - 'a'] = j + 1;
                }
                if (fre2[chs - 'a'] == 0) {
                    fre2[chs - 'a'] = j + 1;
                }
                
                if (fre1[ch - 'a'] != fre2[chs - 'a']) {
                    isMatch = false;
                    break; 
                }
            }
            
            if (isMatch) {
                list.add(words[i]);
            }
        }
        return list;
    }
}

