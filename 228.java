class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if(nums.length == 0) return list;
        int left = nums[0];
        int right = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1] + 1) {
                right = nums[i];
            }
            else {
                if (right == left) {
                    list.add(String.valueOf(left));
                }
                else {
                    String s = left + "->" + right;
                    list.add(s);
                }
                left = nums[i];
                right = nums[i];
            }
        }
        right = nums[nums.length - 1];
        if (right == left) {
            list.add(String.valueOf(left));
        }
        else {
            String s = left + "->" + right;
            list.add(s);
        }
        return list;
        
    }
}
