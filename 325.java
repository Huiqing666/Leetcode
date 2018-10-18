class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
        if(nums.length == 0) return 0;
        int maxLen = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            //System.out.println(sum);
            if(map.containsKey(sum-k)) {
                //System.out.println(maxLen);
                maxLen = Math.max(maxLen, i - map.get(sum-k));
            }
            if(!map.containsKey(sum))map.put(sum, i);
        }
        return maxLen;
        
    }
}
