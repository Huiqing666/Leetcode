class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        if(len < 2)return;
        int m = 0, n = 0;
        for(int i = 0; i < len - 1; i++){
            if(nums[i] == 0){
                m = i;
                n = i+1;
                while(n < len-1 && nums[n] == 0){
                    n++;
                }
                //System.out.println(n);
                int temp = nums[m];
                nums[m] = nums[n];
                nums[n] = temp;
            }
        }
        
    }
}
