class Solution {
    public boolean canPlaceFlowers(int[] nums, int n) {
        int count = 0;
        int zeros = 1;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == 1) {
                i++;
                zeros = 0;
            }else {
                while (i < nums.length && nums[i] == 0) {
                    i++;
                    zeros++;
                }
                if (i != nums.length) count += (zeros - 1) / 2;
                else count += zeros / 2;
            }
        }
        return count >= n;
    }
}
