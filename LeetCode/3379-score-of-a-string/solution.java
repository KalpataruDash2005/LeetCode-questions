class Solution {
    public int scoreOfString(String s) {
        int sum = 0; 
        int []arr = new int[s.length()];
        for(int i =0 ; i<s.length();i++ ){
            char ch = s.charAt(i);
            arr[i] = ch-'0';
        }
        for(int i = 0;i<arr.length-1;i++){
            sum+= Math.abs(arr[i]-arr[i+1]);
        }
        return sum;
    }
}
