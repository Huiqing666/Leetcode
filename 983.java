class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int[] dp = new int[366];
        int j = 0;
        for (int i = 1; i < dp.length; i++) {
            dp[i] = dp[i - 1];
            
            if (j < days.length && i == days[j]) {
                // System.out.println(dp[i]);
                dp[i] += costs[0];
                j++;
            }
            if (i >= 7) {
                dp[i] = Math.min(dp[i], dp[i - 7] + costs[1]);
            }
            if (i >= 30) {
                // System.out.println()
                dp[i] = Math.min(dp[i], dp[i - 30] + costs[2]);
            } 
            

        }
        return dp[365];
        
    }
}
