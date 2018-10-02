class Solution {
    public void wiggleSort(int[] nums) {
        //swap 
        for(int i = 0; i < nums.length; i++) {
            if(i % 2 == 1) {
                if(i < nums.length - 1 && nums[i] < nums[i+1]) {
                    swap(nums, i);
                }
            }else if (i < nums.length -1 && nums[i] > nums[i+1]) {
                swap(nums, i);
            }
        }
        return;
        
    }
    private void swap(int[] nums, int i) {
        int temp = nums[i];
        nums[i] = nums[i+1];
        nums[i+1] = temp;
    }
}
