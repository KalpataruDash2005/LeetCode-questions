class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] nge = new int[n1];

        for (int i = 0; i < n1; i++) {
            int key = nums1[i];
            int index = -1;

            
            for (int j = 0; j < n2; j++) {
                if (nums2[j] == key) {
                    index = j;
                    break;
                }
            }

            
            nge[i] = -1;
            for (int j = index + 1; j < n2; j++) {
                if (nums2[j] > key) {
                    nge[i] = nums2[j];
                    break;
                }
            }
        }

        return nge;
    }
}
