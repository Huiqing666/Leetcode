class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) return false;
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        char[] c3 = s3.toCharArray();
        boolean[][] dp = new boolean[c1.length+1][c2.length+1];
        dp[0][0] = true;
        for (int i = 1; i <= c1.length; i++) {
            if (c1[i-1] == c3[i-1] && dp[i-1][0]) dp[i][0] = true;
        }
        for (int j = 1; j <= c2.length; j++) {
            if (c2[j-1] == c3[j-1] && dp[0][j-1]) dp[0][j] = true;
        }
        for (int i = 1; i <= c1.length; i++) {
            for (int j = 1; j <= c2.length; j++) {
                dp[i][j] = (c1[i-1] == c3[i + j -1] && dp[i-1][j]) || (c2[j-1] == c3[i + j -1] && dp[i][j-1]);
            }
        }
        return dp[c1.length][c2.length];
    }
}
