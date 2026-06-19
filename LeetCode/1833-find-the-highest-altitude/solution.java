class Solution {
    public int largestAltitude(int[] gain) {
        int max = Integer.MIN_VALUE;
        int val = 0;
        for(int i = 0; i<gain.length;i++){
            val += gain[i];
            if(max<val){
                max = val;
            }
        }
        if(max<0) max = 0;
        return max;
    }
}
