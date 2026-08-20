class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List <List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0 ; i<n-2;i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = n-1;
            int ans = -1*nums[i];
                while(left<right){
                int s = nums[left]+nums[right];
                if(s==ans){
                    List <Integer> list = new ArrayList<>();
                    list.add(nums[left]);
                    list.add(nums[right]);
                    list.add(nums[i]);
                    result.add(list);
                    left++;
                    right--;
                    while(left<n && nums[left]==nums[left-1]){
                        left++;
                    }
                    while(right >= 0 && nums[right] == nums[right+1]){
                        right--;
                    }
                }else if(s<ans){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return result;
    }
}