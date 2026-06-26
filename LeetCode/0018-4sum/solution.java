class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
         List <List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0 ; i<n-3;i++){
                if(i>0 && nums[i] == nums[i-1]){
                    continue;
                }
            for(int j = i+1 ; j<n-2;j++){
                if(j>i+1 && nums[j] == nums[j-1]){
                    continue;
                }
                int left = j+1;
                int right = n-1;
                long ans = (long)target - (long)nums[i] - (long)nums[j];
                    while(left<right){
                    long s = (long)nums[left]+(long)nums[right];
                    if(s==ans){
                        List <Integer> list = new ArrayList<>();
                        list.add(nums[left]);
                        list.add(nums[right]);
                        list.add(nums[i]);
                        list.add(nums[j]);
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
        }
        return result;
    }
}
