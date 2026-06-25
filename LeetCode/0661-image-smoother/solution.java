class Solution {
    public int[][] imageSmoother(int[][] img) {

        int n = img.length;
        int m = img[0].length;
        int[][] image = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                int sum = 0;
                int count = 0;

                for (int k = -1; k <= 1; k++) {
                    for (int l = -1; l <= 1; l++) {

                        int nrow = i + k;
                        int ncol = j + l;

                        if (nrow >= 0 && ncol >= 0 && nrow < n && ncol < m) {
                            sum += img[nrow][ncol];
                            count++;
                        }
                    }
                }

                image[i][j] = sum / count;
            }
        }

        return image;
    }
}
