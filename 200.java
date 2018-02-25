class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        if(row == 0)return 0;
        int col = grid[0].length;
        //if(col == 0)return 0;
        int count = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(maxArea(grid,i,j) > 0) count++;
            }
        }
        return count;
        
    }
    private int maxArea(char[][] grid, int i, int j){
        if(i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == '1'){
            grid[i][j] = '0';
            return 1 + maxArea(grid, i-1,j) + maxArea(grid, i+1,j) + maxArea(grid, i, j-1) + maxArea(grid,i,j+1);
        }
        return 0;
    }
}
