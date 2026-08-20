class Solution {
    public String reversePrefix(String s, int k) {
        char [] arr = s.toCharArray();
        int left = 0;
        int right = k-1;
        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return new String(arr);
    }
}
