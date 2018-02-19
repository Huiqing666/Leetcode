class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int[] total = new int[len];
        total[0] = cost[0];
        total[1] = cost[1];
        if(len >= 3){
        for(int i = 2; i < len; i++){
            int left = total[i-2]+cost[i];
            int right = total[i-1] + cost[i];
            if(left < right) total[i] = left;
            else total[i] = right;
        }
        }
        if(total[len-1]<total[len-2])return total[len-1];
        else return total[len-2];     
    }
}
