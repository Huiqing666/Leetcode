class Solution {
    public boolean canJump(int[] nums) {
        if(nums == null || nums.length < 1) return false;
        int len = nums.length;
        if(len == 1) return true;
        int last = len - 1;
        for(int i = len-2; i >= 0; i--) {
            if(nums[i] + i >= last) last = i;
        }
        return (last <= 0);
    }
}
