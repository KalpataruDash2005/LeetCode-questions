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

        int num11 = 0;

        for (int i = 0; i < num1.length(); i++) {
            num11 = num11 * 10;
            num11 += nums1[i];
        }

        int num12 = 0;

        for (int i = 0; i < num2.length(); i++) {
            num12 = num12 * 10;
            num12 += nums2[i];
        }

        int pro = num11 * num12;

        if (pro == 0) {
            return "0";
        }

        int count = 0;
        int temp = pro;

        while (temp != 0) {
            temp /= 10;
            count++;
        }

        int[] proa = new int[count];

        int index = count - 1;

        while (pro != 0) {
            proa[index] = pro % 10;
            pro /= 10;
            index--;
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < proa.length; i++) {
            ans.append(proa[i]);
        }

        return ans.toString();
    }
}