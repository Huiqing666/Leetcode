class Solution {
    public int search(int[] nums, int target) {
        int l = 0, h = nums.length - 1, m = 0;
        //find the minimum
        while (l < h) {
            m = l + (h - l) / 2;
            if (nums[m] > nums[h]) {
                l = m + 1;
            }
            else {
                h = m;
            }
        }
        int rot = l;
        //System.out.println(rot);
        //rotate;
        l = 0;
        h = nums.length - 1;
        while(l <= h) {
            m = l + (h - l) / 2;            
            int realm = (m + rot) % (nums.length);
            System.out.println(nums[realm]);
            if (nums[realm] > target) {
                h = m - 1;
            } 
            else if (nums[realm] < target) {
                l = m + 1;
            }
            else {
                return realm;
            } 
        } 
        return -1;
    }
}
