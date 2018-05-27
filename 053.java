class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int len = nums.length;
        int maxSum = nums[0];
        for(int i = 1; i < len; i++){
            sum +=nums[i];
            if(nums[i] > sum)sum = nums[i];
            if(sum > maxSum)maxSum = sum;
            
        }
        
        return maxSum;
        
    }
}
