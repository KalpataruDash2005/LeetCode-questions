class Solution { 
    public int sortPermutation(int[] nums) { 
        int k = 0; 
        int ans = -1; 

        while (k < nums.length) { 
            if (nums[k] != k) { 
                ans &= nums[k]; 
            } 
            k++; 
        } 
        
        return Math.max(ans, 0); 
    } 
}
