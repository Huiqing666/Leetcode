class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length < 2) return;
        int start = nums.length - 1;
        while(start > 0) {
            if(nums[start] > nums[start-1]) {
                break;
            }
            start--;
        }
        if(start == 0) {
            sort(nums, 0, nums.length-1);
            return;
        }
        int val=nums[start-1];
        int j = nums.length-1;
        while(j >= start) {
            if(nums[j] > val)
                break;
            j--;
        }
        swap(nums,j,start-1);
        sort(nums,start,nums.length-1);
        return;

        
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void sort(int[] nums, int i, int j) {
        if(i > j) return;
        for(int k = i; k <= (i+j)/2; k++) {
            swap(nums, k, j-k+i);
        }
    }
    
}
