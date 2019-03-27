class Solution {
    public int numRookCaptures(char[][] board) {
        
        if (board.length == 0) return 0;
        int r = 0, c = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'R') {
                    r = i;
                    c = j;
                }
            }
        }
        // four direction
        int res = 0;
        for (int i = r - 1; i >= 0; i--) {
            if (board[i][c] == 'B') break;
            if (board[i][c] == 'p') {
                res++;
                break;
            }
        }
        for (int i = r + 1; i < board.length; i++) {
            if (board[i][c] == 'B') break;
            if (board[i][c] == 'p') {
                res++;
                break;
            }
        }
        for (int j = c - 1; j >= 0; j--) {
            if (board[r][j] == 'B') break;
            if (board[r][j] == 'p') {
                res++;
                break;
            }
        }
        for (int j = c + 1; j < board[0].length; j++) {
            if (board[r][j] == 'B') break;
            if (board[r][j] == 'p') {
                res++;
                break;
            }
        }
        return res;
        
    }
}
