class Solution {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int hi = len-1, mid, lo = 0;
        /*
        if(nums[0] > target)return 0;
        for(int i = 0; i < len-1; i++){
            if(nums[i] == target){
                return i;
            }else if(nums[i]<target && nums[i+1]>target){
                return i+1;
            }
            
        }
        if(nums[len-1] == target)return len-1;
        else return len;
        */
        while(lo <= hi){
            mid = (lo + hi)/2;
            if(target < nums[mid]) hi = mid - 1;
            else if(target > nums[mid])lo = mid + 1;
            else return mid;
        }
        return lo;
    }
}
