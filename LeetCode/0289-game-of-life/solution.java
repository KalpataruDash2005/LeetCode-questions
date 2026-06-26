class Solution {
    public void func(int board[][], int x, int y) {
        int m = board.length, n = board[0].length;
        int pos = 0;
        if((board[x][y] & 1) == 0) return;
        for(int i = x - 1; i <= x + 1; i++) {
            for(int j = y - 1; j <= y + 1; j++) {
                if(i == x && j == y) continue;
                pos++;
                if(i < 0 || i >= m || j < 0 || j >= n) continue;
                board[i][j] += (1 << pos);
            }
        }
    }
    public void gameOfLife(int[][] board) {
        int m = board.length, n = board[0].length;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                func(board, i, j);
            }
        }
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                int count = 0;
                for(int mask = 1; mask <= 9; mask++) {
                    if(((1 << mask) & board[i][j]) != 0) {
                        count++;
                    }
                }
                int curr = (board[i][j] & 1);
                if(curr == 1) {
                    if(count < 2) board[i][j] = 0;
                    else if(count >= 2 && count < 4) board[i][j] = 1;
                    else board[i][j] = 0;
                }
                else {
                    if(count == 3) board[i][j] = 1;
                    else board[i][j] = 0;
                }
            }
        }
    }
}
