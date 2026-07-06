class Solution {
    public int lengthOfLongestSubstring(String s) {
        char []ch = s.toCharArray();
        int left = 0;
        int res = 0;
        int []count = new int [128]; 
        for(int right = 0 ; right<ch.length;right++){
            count[ch[right]]++;
            while(count[ch[right]]>1){
                count[ch[left]]--;
                left++;
            }
            res =Math.max(res,right-left+1);
        } 
        return res;
    }
}
