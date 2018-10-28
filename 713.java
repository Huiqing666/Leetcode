class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        //if (k <= 0) return 0;
        int pro = 1;
        int count = 0;
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            pro *= nums[i];
            while (pro >= k) {
                pro /= nums[left];
                left++;
                if(left == nums.length) return count;
            }
            count += i - left + 1;
        }
        return count;
    }
}
