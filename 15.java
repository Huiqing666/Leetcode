class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int len = nums.length;
        int left, right;
        int k = 0;
        for(int i = 0; i < len - 2; i++){
            if(i >= 1 && nums[i] == nums[i-1])continue;
            left = i + 1;
            right = len - 1;
            while(left < right){
                if(nums[left]+nums[right]+nums[i] == 0){
                    //System.out.println("right");      
                    //System.out.println(nums[i]);
                    //System.out.println(nums[left]);
                    //System.out.println(nums[right]);
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while(left < right && nums[left]==nums[left+1])left++;
                    while(left < right && nums[right]==nums[right-1])right--;
                    left++;
                    right--;
                }else if (nums[left]+nums[right] < -nums[i]){
                    left++;
                    //System.out.println(k++);
                }else{
                    right--;
                    //System.out.println(k++);
                }
                
            }
        }
        return result;
        
    }
}
