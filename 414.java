class Solution {
    public int thirdMax(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        boolean x = true;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == Integer.MIN_VALUE) x = false;
            if(nums[i] > max1){
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            }else if(nums[i] > max2 && nums[i] < max1){
                max3 = max2;
                max2 = nums[i];
            }else if(nums[i] >= max3 && nums[i] < max2){
                max3 = nums[i];
            }
        }   
        if(x && max3 == Integer.MIN_VALUE) return max1;
        else if( max2 == Integer.MIN_VALUE) return max1;
        else return max3;
    }
}
