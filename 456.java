class Solution {
    public boolean find132pattern(int[] nums) {
        int len = nums.length;
        if(len < 3)return false;
        int[] minimal = new int[len];
        minimal[0] = nums[0];
        for(int i = 1; i < len-1; i++){
            if(nums[i] < minimal[i-1])minimal[i] = nums[i];
            else minimal[i] = minimal[i-1];
        }
        for(int i = 2; i < len; i++){
            for(int j = 1; j < i; j++){
                if(nums[i] < nums[j] && minimal[j] < nums[i])return true;
            }
        }
        return false;
    }
}
