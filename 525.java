class Solution {
    public int findMaxLength(int[] nums) {
        if(nums.length < 2) return 0;
        int[] diff = new int[nums.length+1];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0,0);
        int len = 0;
        for(int i = 1; i <= nums.length; i++) {        
            diff[i] = diff[i-1] + (nums[i-1] == 0 ? -1 : 1);
            
            if(map.containsKey(diff[i])){
                //System.out.println(map.get(diff[i]));
                len = Math.max(len, i - map.get(diff[i]));
            }else{
                map.put(diff[i], i);
            }
        }
        return len;
        
    }
}
