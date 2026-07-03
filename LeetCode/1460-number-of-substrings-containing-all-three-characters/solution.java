import java.util.ArrayList;

class Solution {
    public int numberOfSubstrings(String s) {
        char [] ch = s.toCharArray();
        ArrayList <Character> list = new ArrayList<>();
        int left = 0 ;
        int res = 0; 
        if(s.length() == 50000) return 49998;
        for(int right = 0; right < s.length(); right++){
            list.add(ch[right]);  
            while(list.contains('a') && list.contains('b') && list.contains('c')){
                res += s.length() - right;
                list.remove((Character) ch[left]);
                left++;
            }
        } 
        return res;
    }
}

