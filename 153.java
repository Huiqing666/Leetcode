class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums[0] < nums[nums.length -1 ]) return nums[0];
        int l = 0, h = nums.length-1, m = 0;
        while(l < h-1) {
            m = l + (h-l)/2;
            if (nums[l] > nums[m]) {
                h = m;
            }
            if (nums[h] < nums[m]) {
                l = m;
            }          
        }
        return nums[h];
    }
}
