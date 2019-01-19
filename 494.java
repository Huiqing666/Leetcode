class Solution {
    int count = 0;
    public int findTargetSumWays(int[] nums, int S) {
        dfs(nums, 0, S);
        return count;
    }
    private void dfs(int[] nums, int index, int target) {
        if (index == nums.length - 1) {
            if (Math.abs(target) == nums[index]) {
                count++;
                if (target == 0) count++;
            }
            return;
        }
        dfs(nums, index + 1, target + nums[index]);
        dfs(nums, index + 1, target - nums[index]);
    }
}
