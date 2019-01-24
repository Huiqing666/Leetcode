class Solution {
    public int superEggDrop(int K, int N) {
        int[][] dp = new int[N+1][K+1];
        int moves = 0;
        while (dp[moves][K] < N) {
            moves++;
            for (int i = 0; i < K; i++) {
                dp[moves][i + 1] = dp[moves - 1][i + 1] + dp[moves - 1][i] + 1;
            }
        }
        return moves;
    }
}
