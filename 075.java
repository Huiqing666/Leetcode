class Solution {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length < 2) return;
        int i = 0, j = nums.length - 1;
        int k = 0;
        for (i = 0; i <= j; i++) {
            if (nums[i] == 0) {
                swap(nums, i, k);
                k++;
            }
            else if (nums[i] == 2) {
                swap(nums, i, j);
                j--;
                i--;
            }
        }
        
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
