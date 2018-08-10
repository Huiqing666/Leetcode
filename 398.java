class Solution {
    int[] nums;
    Random rnd;
    public Solution(int[] nums) {
        this.nums = nums;
        rnd = new Random();
    }
    
    public int pick(int target) {
        int count = 0;
        int result = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != target) {
                
            }else{
                count++;
                if(rnd.nextInt(count) == 0) {
                    result = i;
                }
            }
        }
        return result;
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */
