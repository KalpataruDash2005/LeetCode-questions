class Solution {
    public char findTheDifference(String s, String t) {
        char res = ' ';
        for (int i = 0; i < t.length(); i++) {
            boolean flag = false;
            for (int j = 0; j < s.length(); j++) {
                if (t.charAt(i) == s.charAt(j)) {
                    flag = true;
                }
            }
            if (!flag) {
                res = t.charAt(i); 

            }
        }
        return res;
    }
}
