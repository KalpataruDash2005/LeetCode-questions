class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;

        int[]rot = new int[n];

        for(int i=0; i<n;i++){
            int temp = (i + k) % n;
            rot[temp] = nums[i];
        }
        for(int i=0; i<n; i++){
            nums[i] = rot[i];
        }
    }
}
