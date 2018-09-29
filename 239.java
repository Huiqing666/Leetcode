class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0) return new int[0];
        int maxindex = 0;
        int max = nums[0];
        int[] res = new int[nums.length-k+1];
        for(int i = 0; i < k; i++) {
            if(nums[i] >= max) {
                max = nums[i];
                maxindex = i;
            }
        }
        res[0] = max;
        for(int i = k; i < nums.length; i++) {
            if(nums[i] >= max) {
                max = nums[i];
                maxindex = i;
            }else{
                if(i - k == maxindex){
                    maxindex = i-k+1;
                    max = nums[i-k+1];
                    for(int j = i-k+1; j <= i; j++) {
                         if(nums[j] >= max) {
                            max = nums[j];
                            maxindex = j;
                        }                       
                    }
                }
            }
            res[i-k+1] = max; 
        }
        return res;
        
    }
}
