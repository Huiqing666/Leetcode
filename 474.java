class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int l = strs.length;
        int[][][] dp = new int[l + 1][m + 1][n + 1];
        for (int i = 1; i <= l; i++) {
            int[] ret = split(strs[i - 1]);
            for (int j = 0; j <= m; j++) {
                for (int k = 0; k <= n; k++) {
                    if(j >= ret[0] && k >= ret[1]) {
                        dp[i][j][k] = Math.max(dp[i - 1][j][k], 1 + dp[i - 1][j - ret[0]][k - ret[1]]);
                    }
                    else {
                        dp[i][j][k] = dp[i - 1][j][k];
                    }
                }
            }
        }
        return dp[l][m][n];
        
    }
    
    private int[] split(String s) {
        int[] ret = new int[2];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') ret[0]++;
            else ret[1]++;
        }
        return ret;
    }
}
