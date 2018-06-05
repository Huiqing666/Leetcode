class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int j = i+1;
            if(j == nums.length) j = 0;
            while(j != i && nums[j] <= nums[i]){
                j++;
                if(j == nums.length) j = 0;
            }
            if(j == i) res[i] = -1;
            else res[i] = nums[j];
        }
        return res;
        
    }
}
