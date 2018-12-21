class Solution {
    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > 0 && nums[i] <= nums.length && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        // System.out.println(Arrays.toString(nums));
        int res = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]-1 != i) return i+1;
            else res++;
        }
        return res;
        
        
    }
}
