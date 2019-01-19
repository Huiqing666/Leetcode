class Solution {
    public int[] findPermutation(String s) {
        int[] nums = new int[s.length() + 1];
        for (int i = 1; i <= nums.length; i++) nums[i - 1] = i;
        for (int i = 0; i < s.length(); i++) {
            int n = i;
            while (i < s.length() && s.charAt(i) == 'D') {
                i++;
            }
            reverse(nums, n, i);
        }
        return nums;
    }
    private void reverse(int[] nums, int s, int e) {
        while (s < e) {
            int temp = nums[s];
            nums[s++] = nums[e];
            nums[e--] = temp;
        }
    }
}
