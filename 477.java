class Solution {
    public int totalHammingDistance(int[] nums) {
        int total = 0;
        for (int i = 0; i < 32; i++) {
            int k = 0;
            for (int j = 0; j < nums.length; j++) {
                k += (nums[j] >> i) & 1;
            }
            total += k * (nums.length - k);
        }
        return total;
    }
}
