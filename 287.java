class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        //binary search
        /*
        int high = nums.length - 1;
        int low = 0;
        int mid = (high + low)/2;
        int res = 0;
        while(low <= high){
            mid = (high + low)/2;
            if(nums[mid] == mid) {
                high = mid - 1;
                res = mid;
            }else{
                low = mid + 1;
            }
            System.out.println(mid);
        }
        */
        int i = 0;
        for (; i < nums.length; i++) {
            if(nums[i] == i) break;
        }
        return i;
    }
}
