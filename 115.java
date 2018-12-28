class Solution {
    public int numDistinct(String s, String t) {
        if (s.length() < t.length()) return 0;
        if (s.length() == t.length()) {
            if (s.equals(t)) return 1;
            else return 0;
        }
        int m = s.length();
        int n = t.length();
        int[][] dp = new int[n][m];
        for (int i = 0; i < m; i++) {
            dp[0][i] = s.charAt(i) == t.charAt(0) ? 1 : 0;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (t.charAt(i) == s.charAt(j)) {
                    for (int k = 0; k < j; k++) {
                        dp[i][j] += dp[i - 1][k];
                    }
                }
                
            }
        }
        int res = 0;
        for(int i = 0; i < m; i++) {
            res += dp[n-1][i];
        }
        return res;
        
        
    }
}
