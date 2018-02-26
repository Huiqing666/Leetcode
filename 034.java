class Solution {
    public int[] searchRange(int[] nums, int target) {
        int hi = nums.length -1,lo = 0,mid;
        int[] res = new int[]{-1,-1};
        boolean result = false;
        while(lo <= hi){
            mid = (hi + lo)/2;
            if(nums[mid] > target) hi = mid - 1;
            if(nums[mid] < target) lo = mid + 1;
            if(nums[mid] == target){
                result = true;
                hi = mid - 1;
            }
        }
        if(result)res[0] = lo;
        //System.out.println(res[0]);
        hi = nums.length -1;
        //lo = 0;
        while(lo <= hi){
            mid = (hi + lo)/2;
            if(nums[mid] > target) hi = mid - 1;
            if(nums[mid] <= target) lo = mid + 1;
        }
        if(result)res[1] = hi;
        //System.out.println(res[1]);
        return res;
    }
}
