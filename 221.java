class Solution {
    public int maximalSquare(char[][] m) {
        if(m == null || m.length == 0) return 0;
        int[][] s = new int[m.length][m[0].length];
        int max = 0;
        for(int i = 0; i < m[0].length; i++){
            s[0][i] = m[0][i] - '0';
            max = Math.max(max, s[0][i]);
        }
        for(int j = 0; j < m.length; j++){
            s[j][0] = m[j][0] -'0';
            max = Math.max(max, s[j][0]);
        }
        
        for(int i = 1; i < m.length; i++)
            for(int j = 1; j < m[0].length; j++){
                if(m[i][j] - '0' == 1) s[i][j] = Math.min(s[i-1][j-1], Math.min(s[i][j-1], s[i-1][j])) + 1;
                //System.out.println(s[i][j]);
                max = Math.max(max, s[i][j]);
            }
        return max*max;
        
    }
}
