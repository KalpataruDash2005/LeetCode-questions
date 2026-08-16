class Solution {
    public int strStr(String haystack, String needle) {

        int first = 0;
        int second = 0;

        char[] arr1 = haystack.toCharArray();
        char[] arr2 = needle.toCharArray();

        while (first < arr1.length && second < arr2.length) {

            if (arr1[first] == arr2[second]) {
                first++;
                second++;
            } else {
                first = first - second + 1;
                second = 0;
            }
        }

        if (second == arr2.length) {
            return first - second;
        }

        return -1;
    }
}
