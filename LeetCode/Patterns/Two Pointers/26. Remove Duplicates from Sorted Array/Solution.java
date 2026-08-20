class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        for(int i=0;i<nums.length;i++){
            int val = nums[i];
            set.add(val);
        }
        int i =0;
        for(int val : set){
            nums[i++]=val;
        }

        int k = set.size();
        return k;
    }
}