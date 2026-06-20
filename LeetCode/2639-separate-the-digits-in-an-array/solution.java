class Solution {
    public int[] separateDigits(int[] nums) {
      List <Integer> list = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
        List <Integer> list2 = new ArrayList<>();
        while(nums[i]!=0){
            int rem = nums[i]%10;
            list2.add(rem);
            nums[i]/=10;
        }
        Collections.reverse(list2);
        list.addAll(list2);
      }

    int[] arr = list.stream().mapToInt(i -> i).toArray();
    return arr;
    }
}
