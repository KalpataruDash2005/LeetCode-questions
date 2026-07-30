class Solution {
    public int maxProduct(int[] nums) {
        int maxLead = nums[0];
        int minLead = nums[0];
        int ans = nums[0];

        for(int i = 1; i<nums.length ; i++ ){
            int v1 = maxLead*nums[i];
            int v2 = nums[i];
            int v3 = minLead*nums[i];

            maxLead = Math.max(v3,Math.max(v1,v2));
            minLead = Math.min(v3,Math.min(v1,v2));

            ans = Math.max(maxLead,ans);
        }
        return ans;

    }
}

