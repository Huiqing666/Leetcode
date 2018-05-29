class Solution {
    public int minMoves(int[] nums) {
        int min = nums[0];
		int sum = 0;
		for(int i : nums) {
			sum+=i;
			min = Math.min(min, i);
		}
		
		//System.out.println(sum);
		return Math.abs(sum - (min * nums.length));
    }
}
