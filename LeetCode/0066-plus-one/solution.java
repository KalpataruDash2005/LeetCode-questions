class Solution {
    public int[] plusOne(int[] digits) {
        int low = 0;
        int i = digits.length - 1;
        int val = 0;
        
        if (digits[i] < 9) {
            digits[i] = digits[i] + 1; 
           
            return digits;
        } else {
           
            while (i >= 0 && digits[i] == 9) {
                digits[i] = 0;
                i--;
            }
            
           
            if (i >= 0) {
                digits[i] = digits[i] + 1;
                return digits;
            }
            
            
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
    }
}

