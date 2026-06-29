class Solution {
    public static void sort(int []nums){
        int n = nums.length;
        for(int i = 1;i<n;i++){
            int key = nums[i];
            int j = i-1;
            while(j>=0 && key < nums[j]){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
    }
    public List<Integer> targetIndices(int[] nums, int target) {
        List <Integer> list = new ArrayList<>();
        sort(nums);
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == target){
                list.add(i);
            }
        }
        return list;
    }
}
