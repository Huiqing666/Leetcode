class Solution {
    public int maxProfit(int[] prices) {
        // int[] dp = new int[prices.length];
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                res += prices[i] - prices[i-1];
            }
        }
        return res;
        
    }
}
