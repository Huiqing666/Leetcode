class Solution {
    public int singleNumber(int[] nums) {
        int res = nums[0];
        int len = nums.length;
        for(int i = 1; i < len; i++){
            res = res^nums[i];
        }
        return res;
        
    }
}
