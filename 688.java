class Solution {
    public double knightProbability(int N, int K, int r, int c) {
        int[][] moves = {{1,2},{-1,2},{1,-2},{-1,-2},{2,1},{-2,1},{2,-1},{-2,-1}};
        double[][] dp0 = new double[N][N];
        for(double[] row : dp0) Arrays.fill(row, 1);
        for(int t = 0; t < K; t++) {
            double[][] dp1 = new double[N][N];
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    for(int[] move : moves){
                        int x = i + move[0];
                        int y = j + move[1];
                        if(isLegal(x, y, N)) dp1[i][j] += dp0[x][y];
                    }
                }
            }
            dp0 = dp1;
            
        }
        return dp0[r][c]/Math.pow(8,K);
        
    }
    private boolean isLegal(int r, int c, int N) {
        if(r >=0 && c >= 0 && r < N && c < N) return true;
        return false;
    }
}
