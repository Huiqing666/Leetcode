class Solution {
    public int findPeakElement(int[] nums) {
        int l = 0, h = nums.length - 1, m = 0;
        while(l < h) {
            m = l + (h - l) / 2;
            //System.out.println(nums[m]);
            if(m > 0 && m < nums.length - 1) {
                if(nums[m] < nums[m + 1] && nums[m] < nums[m-1]) {
                    l = m + 1;
                } 
                else if (nums[m] > nums[m + 1] && nums[m] > nums[m - 1]) {
                    return m;
                }
                else {
                    if(nums[m] < nums[m - 1]) h = m - 1;
                    else l = m + 1;
                }
            }
            else {
                return nums[l] > nums[h] ? l : h;
            }
        }
        return h;
        
    }
}
