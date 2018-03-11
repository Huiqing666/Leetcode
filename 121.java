class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int len = prices.length;
        int temp = Integer.MAX_VALUE;
        for(int i = 0; i < len; i++){
            if(prices[i] < temp){
                temp = prices[i];
            }else{
                max = Math.max(max, prices[i] - temp);
            }    
        }
        return max;
        
        /*
        for(int i = 1; i < len; i++){
            for(int j = 0; j < i; j++){
                max = Math.max(max, prices[i] - prices[j]);
            }
        }
        */
        //return max;
        
    }
}
