class Solution {
    public boolean validTree(int n, int[][] edges) {
        int[] nums = new int[n];
        Arrays.fill(nums, -1);
        for(int i = 0; i < edges.length; i++) {
            int left = find(nums, edges[i][0]);
            int right = find(nums, edges[i][1]);
            if(left == right) return false;
            else{
                nums[left] = right;   
            }
        }
        return edges.length == n - 1;
        
        
        
    }
    private int find(int[] nums, int i) {
        if(nums[i] == -1) return i;
        return find(nums, nums[i]);
    }
} 
