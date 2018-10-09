class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] row = new int[grid.length];
        int[] col = new int[grid[0].length];
        for(int i = 0; i < grid.length; i++) {
            int colm = 0;
            for(int j = 0; j < grid[0].length; j++) {
                colm = Math.max(colm, grid[i][j]);
            }
            row[i] = colm;
        }
        for(int i = 0; i < grid[0].length; i++) {
            int rowm = 0;
            for(int j = 0; j < grid.length; j++) {
                rowm = Math.max(rowm, grid[j][i]);
            }
            col[i] = rowm;
        }
        int res = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                res+=Math.min(row[i],col[j])-grid[i][j];
            }
        }
        return res;
        
    }
}
