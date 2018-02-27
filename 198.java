class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        if(len == 0)return 0;
        int res;
        int[] sum = new int[len]; 
        sum[0] = nums[0];
        if(len == 1)return sum[0];
        sum[1] = Math.max(nums[0], nums[1]);
        if(len == 2)return sum[1];
        for(int i = 2; i < nums.length; i++){
                sum[i] = Math.max(sum[i - 1], sum[i - 2] + nums[i]);
        }
        return sum[len - 1];
    }
}
