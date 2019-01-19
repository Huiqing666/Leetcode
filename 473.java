class Solution {
    public boolean makesquare(int[] nums) {
        if (nums.length < 4) return false;
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        if (sum % 4 != 0) return false;
        int side = sum / 4;
        return dfs(nums, new int[4], 0, side);
    }
    private boolean dfs(int[] nums, int[] sum, int index, int side) {
        if (index == nums.length) {
            if (sum[0] == side && sum[1] == side && sum[2] == side) return true;
            else return false;
        }
        // boolean result = false;
        for (int i = 0; i < 4; i++) {
            if (sum[i] + nums[index] > side) {
                continue;
            }
            sum[i] += nums[index];
            if(dfs(nums, sum, index + 1, side)) return true;
            sum[i] -= nums[index];
        }
        return false;
        
    }
}
