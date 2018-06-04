class Solution {
    public int minMoves2(int[] nums) {
        if(nums.length < 2) return 0;
        Arrays.sort(nums);
        int median = nums.length % 2 == 1 ? nums[nums.length/2] : (nums[nums.length/2-1] + nums[nums.length/2])/2;
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            res += Math.abs(nums[i] - median);
        }
        return res;
        
        
    }
}
