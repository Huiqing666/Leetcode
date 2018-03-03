class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int len = nums.length;
        int[] temp = new int[len];
        int x = 1;
        temp[0] = 1;
        for(int i = 1; i < len; i++){
            temp[i] = temp[i-1]*nums[i-1];  
        }
        for(int i = len - 1; i >= 0; i--){
            temp[i] = x * temp[i];
            x = x * nums[i];
        }
        return temp;
        
    }
}
