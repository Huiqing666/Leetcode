class Solution {
    public int countComponents(int n, int[][] edges) {
        int[] nums = new int[n];
        Arrays.fill(nums, -1);
        for(int i = 0; i < edges.length; i++) {
            int left = find(nums, edges[i][0]);
            int right = find(nums, edges[i][1]);
            if(left != right) {
                nums[left] = right;
                n--;
            }
            
        }

        return n;
        
        
        
    }
    private int find(int[] nums, int i) {
        if(nums[i] == -1) return i;
        nums[i] = find(nums, nums[i]);
        return nums[i];
    }
}
