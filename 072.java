class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dis = new int[m+1][n+1];
        for (int i = 0; i <= m; i++) {
            dis[i][0] = i;
        }
        for (int i = 1; i <= n; i++) {
            dis[0][i] = i;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    dis[i][j] = dis[i-1][j-1];
                }
                else {
                    dis[i][j] = Math.min(dis[i-1][j-1], Math.min(dis[i-1][j], dis[i][j-1]));
                    dis[i][j]++;
                }
            }
        }
        return dis[m][n];
        
    }
}
