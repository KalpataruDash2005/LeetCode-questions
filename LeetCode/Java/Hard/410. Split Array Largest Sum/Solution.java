class Solution {
    public boolean isPossible(int[] nums,int k,int sumLimit){
        int subArray=1;
        int currSum=0;
        for(int i:nums){
            if(i>sumLimit) return false;
            if(currSum+i<=sumLimit) currSum+=i;
            else{
                subArray++;
                currSum=i;
            }
        }
        if(subArray>k) return false;
        return true;
    }
    public int splitArray(int[] nums, int k) {
        if(nums.length<k) return -1;
        int left=0;
        int right=0;
        for(int i:nums) right+=i;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(isPossible(nums,k,mid)) right=mid-1;
            else left=mid+1;
        }
        return left;
    }
}  