class Solution {
    public int time(int mid , int[] piles ){
        int t = 0;
        for(int i = 0;i<piles.length;i++){
            if(piles[i]%mid == 0){
                t += piles[i]/mid;
            }else{
                t+= (piles[i]/mid)+1;
            }
        }
        return t;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int ans = 0;
        int low = 1;
        int high = piles[0];
        for(int i = 0 ; i<piles.length;i++){
            if(piles[i]>high){
                high = piles[i];
            }
        }
        while(low < high){
            int mid = low + (high - low)/2;
            ans = time(mid , piles);
            if(ans <= h){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}