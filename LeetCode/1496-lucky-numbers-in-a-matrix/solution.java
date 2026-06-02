class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {

        ArrayList<Integer> list = new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length;

        int[] arr = new int[n];

        // Store minimum of each row
        for (int i = 0; i < n; i++) {

            int min = matrix[i][0];

            for (int j = 1; j < m; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }

            arr[i] = min;
        }

        // Find maximum among row minimums
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Find the column where max exists
        int colIndex = -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == max) {
                    colIndex = j;
                    break;
                }
            }
        }

        // Verify max is maximum in its column
        boolean lucky = true;

        for (int i = 0; i < n; i++) {
            if (matrix[i][colIndex] > max) {
                lucky = false;
                break;
            }
        }

        if (lucky) {
            list.add(max);
        }

        return list;
    }
}
