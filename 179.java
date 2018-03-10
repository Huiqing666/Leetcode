class Solution {
    public String largestNumber(int[] nums) {
        //Arrays.sort(nums);
        int len = nums.length;
        String[] res = new String[len];
        for(int i = 0; i < len; i++){
            res[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(res, (s1, s2) -> ((s2 + s1).compareTo(s1 + s2)));
        String result = String.join("", res);
        if (result.isEmpty() || result.charAt(0) == '0') {
            return "0";
        }
        
        return result;
    }
}
