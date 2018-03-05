class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int temp = nums[0];
        int len = nums.length;
        for(int i = 1; i < len; i++){
            if(nums[i] == temp)count++;
            else count--;
            if(count <= 0){
                temp = nums[i];
                count = 1;
            }
        }
        return temp;
        
    }
}
