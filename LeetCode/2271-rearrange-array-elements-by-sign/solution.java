class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos = 0 , neg = 0;
        for(int i = 0 ; i < nums.length ; i++ ){
            if(nums[i]>0){
                pos ++;
            }
            else{
                neg++;
            }
        }
        int [] arr1 = new int [pos];
        int [] arr2 = new int [neg];
        int a = 0;
        int b = 0; 
         for(int i = 0 ; i < nums.length ; i++ ){
            if(nums[i]>0){
                arr1[a] = nums[i];
                a++;
            }
            else{
                arr2[b] = nums[i];
                b++;
            }
        }

        int i = 0;
        int j = 0;
        int idx = 0;
        while(i<pos && j<neg){
            nums[idx] = arr1[i];
            nums[idx+1] = arr2[j];
            idx+=2;
            i++;
            j++;
        }
        while(i<pos){
            nums[idx] = arr1[i];
            idx++;
            i++;
        }
        while(j<neg){
            nums[idx] = arr2[j];
            idx++;
            j++;
        }
        return nums;
    }
}
