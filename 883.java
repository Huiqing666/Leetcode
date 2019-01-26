class Solution {
    public int projectionArea(int[][] grid) {
        int xy = 0;
        int[] xz = new int[grid.length];
        int[] yz = new int[grid.length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) continue;
                xy++;
                xz[i] = Math.max(grid[i][j], xz[i]);
                yz[j] = Math.max(grid[i][j], yz[j]);
            }
        }
        for (int i = 0; i < grid.length; i++) {
            xy += xz[i] + yz[i];
        }
        return xy;
        
    }
}
