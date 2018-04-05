class Solution {
    public int missingNumber(int[] nums) {
        /*
        int[] number = new int[nums.length + 1];
        for(int i = 0; i < nums.length; i++){
            number[nums[i]] = -1;
        }
        for(int i = 0; i <= nums.length; i++){
            if(number[i] == 0) return i;
        }
        return 0;
        */
        int res = nums.length;
        for (int i = 0; i < nums.length; i++) {
           res ^= i;
            res ^= nums[i];
        }
        return res;
    }
}
