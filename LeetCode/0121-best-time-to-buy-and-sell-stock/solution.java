class Solution {
    public int maxProfit(int[] prices) {
        int maxp = 0;
        int minp = Integer.MAX_VALUE;
        int n = prices.length;
        for(int i = 0;i<n;i++){
            if(prices[i]<minp){
                minp = prices[i];
            } else if(prices[i]-minp>maxp){
                maxp = prices[i]-minp;
            }
        }
        return maxp;
    }
}
