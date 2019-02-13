class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 2; i < nums.length; i++) {
            int l1 = 0, l2 = i-1;
            
            while (l1 < l2) {
                if (nums[l1] + nums[l2] > nums[i]) {
                    // System.out.println(l2 - l1);
                    count += l2 - l1;
                    l2--;
                }
                else {
                    l1++;
                }
            }
        }
        return count;
    }
}
