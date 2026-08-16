import java.util.HashMap;

class Solution { 
    public boolean wordPattern(String pattern, String s) { 
        String[] word = s.trim().split("\\s+"); 
        char[] arr = pattern.toCharArray(); 
        
        int left1 = 0; 
        int right1 = arr.length - 1; 
        int left2 = 0; 
        int right2 = word.length - 1; 
        
        if (pattern.length() != word.length) { 
            return false; 
        } 
        
        HashMap<Character, String> map = new HashMap<>();
        
        while (left1 <= right1) { 
            if (map.containsKey(arr[left1])) {
                if (!map.get(arr[left1]).equals(word[left2])) {
                    return false;
                }
            } else {
                if (map.containsValue(word[left2])) {
                    return false;
                }
                map.put(arr[left1], word[left2]);
            }
            
            left1++;
            left2++;
        } 
        
        return true; 
    } 
}
