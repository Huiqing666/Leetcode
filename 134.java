class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        //if(gas.length == 0 || cost.length == 0) return -1;
        int gasSum = 0;
        int costSum = 0;
        int start = 0;
        int curr = 0;
        for(int i = 0; i < gas.length; i++){
            gasSum += gas[i];
            costSum += cost[i];
            curr += gas[i] - cost[i];
            if(curr < 0){
                start = i + 1;
                curr = 0;
            }
        }
        return gasSum >= costSum ? start : -1;
        
    }
}
