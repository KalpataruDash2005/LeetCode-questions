class Solution {
    public int maxVowels(String s, int k) {
        int low = 0 , high = k;
        int ans = 0;
        int count = 0;

        for(int i = 0 ; i < k ; i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                count++;
            }
        }
        ans = count;

        while(high < s.length()){
            if(s.charAt(low) == 'a' || s.charAt(low) == 'e' || s.charAt(low) == 'i' || s.charAt(low) == 'o' || s.charAt(low) == 'u'){
                count--;
            }

            if(s.charAt(high) == 'a' || s.charAt(high) == 'e' || s.charAt(high) == 'i' || s.charAt(high) == 'o' || s.charAt(high) == 'u'){
                count++;
            }

            if(count > ans){
                ans = count;
            }

            low++;
            high++;
        }
        return ans;
    }
}

