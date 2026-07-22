class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int sum = 0;
        int [] rowmax = new int [grid.length];
        int [] colmax = new int [grid[0].length];
        for(int i = 0 ; i<grid.length ;i++ ){
           for (int j = 0; j < grid[i].length; j++) {
                rowmax[i] = Math.max(rowmax[i], grid[i][j]);
                colmax[j] = Math.max(colmax[j], grid[i][j]);
            }
        }

        
        for(int i = 0 ; i< grid.length ;i++ ){
            for(int j = 0; j<grid[0].length;j++){
                int min = Math.min(rowmax[i],colmax[j]);
                sum += Math.abs(min - grid[i][j]);
            }
        }
        return sum;
    }
}
