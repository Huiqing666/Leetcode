class Solution {
    public int minFallingPathSum(int[][] A) {
        if (A == null || A.length == 0) return 0;
        int[][] dp = new int[A.length+1][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                int above = dp[i][j];
                if(j > 0) above = Math.min(above, dp[i][j-1]);
                if(j < A[0].length - 1) above = Math.min(above, dp[i][j+1]);
                dp[i+1][j] = A[i][j] + above;
            }
        }
        int minPath = Integer.MAX_VALUE;
        for (int i = 0; i < A[0].length; i++) {
            minPath = Math.min(dp[A.length][i], minPath);
        }
        return minPath;
    }
}
