class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length == 0)return 0;
        int temp = 1;
        int max = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i-1]){
                temp++;
                if(temp > max) max = temp;
            }else{
                temp = 1;
            }
        }
        return max;
    }
}
