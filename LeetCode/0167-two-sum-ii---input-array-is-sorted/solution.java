class Solution {
    public int[] twoSum(int[] numbers, int target) {
      Map <Integer , Integer> map = new HashMap<>();
      int result[] = {-1,-1};
      for(int i = 0 ; i<numbers.length;i++){
        int x = target-numbers[i];
        if(!map.containsKey(x)){
            map.put(numbers[i],i);
        }
        else{
            int position1 = map.get(x)+1;
            int position2 = i+1;
            result[0] = position1;
            result[1] = position2;
            return result;
        }
      }
      return result;
    }
}

