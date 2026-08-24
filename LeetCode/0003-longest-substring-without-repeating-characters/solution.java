class Solution {
    public int lengthOfLongestSubstring(String s) {
        List <Character> list = new ArrayList<>();
        int low = 0;
        int high = 0;
        int ans = 0;
        while(high < s.length()){
            char curr = s.charAt(high);
            while (list.contains(curr)) {
                list.remove(0);
                low++; 
            }
           list.add(curr);
           ans = Math.max(ans , high -low +1);
           high++;
           
        }
        return ans;
    }
}
