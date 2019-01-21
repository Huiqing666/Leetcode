class Solution {
    public int change(int amount, int[] coins) {
        Arrays.sort(coins);
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j < dp.length; j ++) {
                dp[j] += dp[j - coins[i]];
                //System.out.println(dp[j]);
            }

        }
        return dp[amount];
    }
}
