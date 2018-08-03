class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int min = Integer.MAX_VALUE;
        int temps = 0;
        int start = 0;
        for(int i = 0; i <= nums.length;  i++) {
            while(temps >= s) {
                min = Math.min(min, i - start);
                temps -= nums[start];
                start++;
            }
            if(i < nums.length) temps += nums[i];
            //System.out.println(temps);
        }
        return min == Integer.MAX_VALUE? 0 : min;
        
    }
}
