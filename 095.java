class Solution {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        if(len == 1 )return nums[0];
        int max = nums[0], min = nums[0], res = nums[0];
        for(int i = 1; i < len; i++){     
            int temp = max;
            max = Math.max(Math.max(max*nums[i], min*nums[i]), nums[i]);
            //System.out.println(max);
            min = Math.min(Math.min(temp*nums[i], min*nums[i]), nums[i]);
            if(max > res)res = max;
        }
        return res;
    }
}
