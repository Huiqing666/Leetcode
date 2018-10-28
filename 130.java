class Solution {
    public void solve(char[][] board) {
        if (board == null || board.length == 0) return;
        boolean[][] visited = new boolean[board.length][board[0].length];
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i++) {
            if(board[i][0] == 'O') isBorder(board, i , 0, visited);
        }
        for (int i = 0; i < m; i++) {
            if(board[i][n-1] == 'O') isBorder(board, i , n-1, visited);
        }
        for (int i = 0; i < n; i++) {
            if(board[0][i] == 'O') isBorder(board, 0 , i, visited);
        }
        for (int i = 0; i < n; i++) {
            if(board[m-1][i] == 'O') isBorder(board, m-1 , i, visited);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(!visited[i][j] && board[i][j] == 'O') board[i][j] = 'X';
            }
        }
        return;
    }
    public void isBorder(char[][] board, int i, int j, boolean[][] visited) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) return;
        if (visited[i][j]) return;
        if (board[i][j] == 'X') return;
        visited[i][j] = true;
        isBorder(board, i-1, j, visited);
        isBorder(board, i+1, j, visited);
        isBorder(board, i, j-1, visited);
        isBorder(board, i, j+1, visited);
    }
}
