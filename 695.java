class Solution {
    // dfs
    int max = 0;
    public int maxAreaOfIsland(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    helper(i, j, grid);
                }
            }
        }
        return max;
    }
    private int helper(int i, int j, int[][] grid) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) {
            return 0 ;
        }
        grid[i][j] = 0;
        int curr = 1 + helper(i - 1, j, grid) + helper(i, j - 1, grid) + helper(i + 1, j, grid) + helper(i, j + 1, grid);
        
        if (curr > max) {
            max = curr;
            // System.out.println(i + " " + j);
        }
        return curr;

        
    }
}
