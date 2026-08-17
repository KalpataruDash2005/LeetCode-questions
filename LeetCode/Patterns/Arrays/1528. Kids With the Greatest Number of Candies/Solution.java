class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int maxCandies = 0;
        for (int candyy : candies) {
            if (candyy > maxCandies) {
                maxCandies = candyy;
            }
        }
        for(int i = 0 ; i<candies.length;i++ ){
            if(candies[i] + extraCandies >= maxCandies){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
}