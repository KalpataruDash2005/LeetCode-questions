class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int v : nums){
            set.add(v);
        }

        int i = 0;
        for (int v : set) {
            nums[i++] = v;
        }
        return set.size();
    }
}