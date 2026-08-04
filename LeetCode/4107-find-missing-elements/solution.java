    class Solution {
        public List<Integer> findMissingElements(int[] nums) {
            List <Integer> list =  new ArrayList<>();
            Arrays.sort(nums);
            int st = 0;
            int end = nums.length-1;
            int i = nums[0];
            while(st<=end){
                if(i == nums[st]){
                 st++;
                 i++;    
                }else{
                    list.add(i);
                    i++;
                }
            
            }
            return list;
        }
    }
