class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int count = 0;
        int sum = 0;
        Arrays.sort(costs);
        for(int i = 0;i<costs.length;i++){
            if(costs[i]>coins){
                return 0;
            }
            else{
              sum += costs[i];
              if(sum<=coins){
                count++;
              }
              else{
                break;
              }
            }
        }
        return count;
    }
}
