class Solution {
    public int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(!set.add(nums[i])){
                set.remove(nums[i]);
            }
        }
        int n = 0;
        for(int i : set){
            res[n++] = i;
        }
        return res;
    }
}
