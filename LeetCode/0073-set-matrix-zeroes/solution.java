class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        boolean[] zeroRows = new boolean[n];
        boolean[] zeroCols = new boolean[m];
        
        int i = 0; 
        while (i < n) {
            int j = 0;
            while (j < m) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
                j++;
            }
            i++; 
        }

        int row = 0;
        while (row < n) {
            int col = 0;
            while (col < m) {
                if (zeroRows[row] || zeroCols[col]) {
                    matrix[row][col] = 0;
                }
                col++;
            }
            row++;
        }

    }
}
