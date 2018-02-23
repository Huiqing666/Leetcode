class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int diff = Integer.MAX_VALUE, sum = 0;//least = Integer.MAX_VALUE;
        Arrays.sort(nums);
        int len = nums.length;
        int left,right;
        for(int i = 0; i < len -2; i++){
            left = i + 1;
            right = len -1;
            sum = nums[i]+nums[left]+nums[right];
            while(right - 1 > left){
                if(sum == target)return target;
                if(sum < target) {
                    left++;
                    sum = nums[i]+nums[left]+nums[right];
                    if(Math.abs(sum - target) < Math.abs(diff)) diff = sum - target;
                    //else break;
                }else{
                    right--;
                    sum = nums[i]+nums[left]+nums[right];
                    if(Math.abs(sum - target) < Math.abs(diff)) diff = sum - target;
                    //else break;
                    }
                }
        }
        if(Math.abs(sum - target) < Math.abs(diff)) diff = sum - target;
        return target + diff;
    }
}
