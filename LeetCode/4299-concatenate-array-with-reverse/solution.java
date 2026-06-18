class Solution {
    public int[] concatWithReverse(int[] nums) {
        int arr[] = new int[2*nums.length];
        int idx=0;
        for(int i =0;i<nums.length;i++){
            arr[idx++] = nums[i];
        }
        for(int i = nums.length-1; i>=0;i--){
            arr[idx++] = nums[i];
        }
        return arr;
    }
}
