class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length, n = dungeon[0].length;
        int[][] dp = new int[m][n];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (i == m - 1 && j == n - 1) {
                   dp[i][j] = Math.max(1 - dungeon[i][j], 1);
                }
                else if(i == m-1) {
                    dp[i][j] = Math.max(dp[i][j + 1] - dungeon[i][j], 1);
                }
                else if(j == n-1) {
                    dp[i][j] = Math.max(dp[i + 1][j] - dungeon[i][j], 1);
                }
                else{
                    int down = Math.max(dp[i + 1][j] - dungeon[i][j], 1);
                    int right = Math.max(dp[i][j + 1] - dungeon[i][j], 1);
                    dp[i][j] = Math.min(right, down);
                }
            }
        }
        return dp[0][0];
        
    }
}
