class Solution {
    public int countDays(int[] bloomDay, int mid ,int k){
        int flower = 0;
        int count = 0;
        for(int i = 0;i<bloomDay.length;i++ ){
            if(mid >= bloomDay[i]){
                flower++;
                if(flower == k){
                    count++;
                    flower = 0;
                }
            }else{
                flower = 0;
            }
        }
        return count;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int low = bloomDay[0];
        int high = bloomDay[0];
        int ans = 0;
        for(int i = 0 ; i<bloomDay.length ; i++ ){
           low = Math.min(low, bloomDay[i]);
           high = Math.max(high, bloomDay[i]);
        }
        ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            int days = countDays(bloomDay,mid , k);
            if(days >=  m){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
}