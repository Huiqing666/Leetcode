class Solution {
    public boolean canPartition(int[] nums) {
        if(nums.length < 2) return false;
        int sum = 0;
        for(int i : nums){
            sum+= i;
        }
        if(sum % 2 == 1) return false;
        //Arrays.sort(nums);
        return partition(nums, sum / 2, nums.length - 1);        
    }
    private boolean partition(int[] nums, int target, int start){
        if(start < 0) return false;
        if(target == nums[start]) return true;
        if(target < nums[start]) return false;
        return partition(nums, target-nums[start], start - 1) || partition(nums, target,  start - 1);

        
    }
}
