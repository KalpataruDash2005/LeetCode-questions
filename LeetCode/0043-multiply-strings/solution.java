class Solution {
    public String multiply(String num1, String num2) {
        int[] nums1 = new int[num1.length()];
        int[] nums2 = new int[num2.length()];

        for (int i = 0; i < num1.length(); i++) {
            nums1[i] = num1.charAt(i) - '0';
        }

        for (int i = 0; i < num2.length(); i++) {
            nums2[i] = num2.charAt(i) - '0';
        }

        int[] proa = new int[num1.length() + num2.length()];

        for (int i = nums1.length - 1; i >= 0; i--) {
            for (int j = nums2.length - 1; j >= 0; j--) {
                int pro = nums1[i] * nums2[j];
                int index = i + j + 1;

                pro += proa[index];

                proa[index] = pro % 10;
                proa[index - 1] += pro / 10;
            }
        }

        StringBuilder ans = new StringBuilder();

        int i = 0;

        while (i < proa.length && proa[i] == 0) {
            i++;
        }

        while (i < proa.length) {
            ans.append(proa[i]);
            i++;
        }

        return ans.length() == 0 ? "0" : ans.toString();
    }
}
