class Solution {
    public int longestLine(int[][] M) {
        if (M.length == 0) return 0;
        int[][][] dp = new int[M.length][M[0].length][4];
        int max = 0;
        int[][] dir = new int[][]{{-1, 0}, {0, -1}, {-1, -1}, {-1, 1}};
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                if (M[i][j] == 0) continue;
                for (int k = 0; k < 4; k++) {
                    int r = i + dir[k][0];
                    int c = j + dir[k][1];
                    if (r < 0 || c < 0 || r >= M.length || c >= M[0].length) {
                        dp[i][j][k] = 1;
                    }
                    else dp[i][j][k] = dp[r][c][k] + 1;
                    max = Math.max(max, dp[i][j][k]);
                }
            }
        }
        return max;
    }
}
