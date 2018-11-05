class Solution {
    public boolean search(int[] nums, int target) {
        int l = 0, h = nums.length - 1, m = 0;
        if (nums == null || nums.length == 0) return false;
        while (l <= h) {
            m = l + (h - l) / 2;
            if (nums[m] == target) return true;
            if (nums[m] < nums[h] || nums[m] < nums[l]) {
                if (nums[m] < target && nums[h] >= target) {
                    l = m + 1;
                }
                else {
                    h = m - 1;
                }
            }
            else if (nums[l] < nums[m] || nums[m] > nums[h]) {
                if (nums[m] <= target || nums[l] > target) {
                    l = m + 1;
                }
                else {
                    h = m - 1;
                }
            }
            else {
                h--;
            }
        }
        return false;
    }
}
