import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int ind = 0;
        
        for (int i = 0; i < nums1.length; i++) {
            arr[ind] = nums1[i];
            ind++;
        }

        for (int i = 0; i < nums2.length; i++) {
            arr[ind] = nums2[i];
            ind++;
        }

        Arrays.sort(arr);

        int len = arr.length;
        
        if (len % 2 == 0) {
            return (arr[(len / 2) - 1] + arr[len / 2]) / 2.0;
        } else {
            return arr[len / 2];
        }
    }
}
