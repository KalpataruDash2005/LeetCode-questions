import java.util.ArrayList;

class Solution {
    public String reverseWords(String s) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        char[] ch = s.toCharArray();
        
        int left = 0;
        int right = 0;
        int n = ch.length;
        
        while (right < n) {
            while (right < n && ch[right] == ' ') {
                right++;
            }
            if (right >= n) break;
            
            left = right;
            
            while (right < n && ch[right] != ' ') {
                right++;
            }
            
            list.add(s.substring(left, right));
        }
        
        for (int i = list.size() - 1; i >= 0; i--) {
            sb.append(list.get(i));
            if (i > 0) {
                sb.append(" ");
            }
        }
        
        return sb.toString();
    }
}
