class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                tmp++;
            }else{
                max = Math.max(max, tmp);
                tmp = 0;
            }
        }
        return Math.max(max, tmp);
                

        
    }
}
