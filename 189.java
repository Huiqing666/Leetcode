class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        if(k == 0)return;
        int temp = 0;
        for(int i = 0; i < (len - k)/2; i++){
            temp = nums[len - k - i - 1];
            nums[len - k - i - 1] = nums[i];
            nums[i] = temp;
        }
        //System.out.println(Arrays.toString(nums));
        for(int i = 0; i < (k/2); i++){
            temp = nums[len - i - 1];
            nums[len - i - 1] = nums[len - k + i];
            nums[len - k + i] = temp;
        }
        //System.out.println(Arrays.toString(nums));
        for(int i = 0; i < (len/2); i++){
            temp = nums[len - 1 - i];
            nums[len - i - 1] = nums[i];
            nums[i] = temp;
        }
        
    }
}
