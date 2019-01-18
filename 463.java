class Solution {
    public int islandPerimeter(int[][] grid) {
        
        int count = 0;
        int neigh = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    count++;
                    if (i > 0 && grid[i - 1][j] == 1) neigh++;
                    if (j > 0 && grid[i][j - 1] == 1) neigh++;
                    
                }
            }
        }
        return 4 * count - 2 * neigh;
        
    }
}
