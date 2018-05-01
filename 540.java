class Solution {
    public int singleNonDuplicate(int[] nums) {
        //binary search
        int h = nums.length - 1;
        int l = 0;
        int m = 0;
        while(h > l){
            m = (h + l)/2;
            if(m%2 == 0){
                if(nums[m] == nums[m+1])l = m+2;
                else h = m - 2;
            }else{
                if(nums[m] == nums[m-1])l = m+1;
                else h = m - 1;
            }
        }
        return nums[h];
    }
}
