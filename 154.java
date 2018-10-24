class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums[0] < nums[nums.length -1 ]) return nums[0];
        int l = 0, h = nums.length-1, m = 0;
        while(l < h) {
            m = l + (h-l)/2;
            if (nums[h] > nums[m]) {
                h = m;
            }
            else if (nums[h] < nums[m]) {
                l = m+1;
            }
            else {
                h--;
            }
        }
        return nums[l];
    }
}
