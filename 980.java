class Solution {
    int res = 0;
    int count = 0;
    int[][] dir = new int[][]{{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
    public int uniquePathsIII(int[][] grid) {
        int[] start = new int[2];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    start[0] = i;
                    start[1] = j;
                }
                else if (grid[i][j] == 0) {
                    count++;
                }
            }
        }
        count++;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        dfs(grid, start, visited, 0);
        return res;
    }
    private void dfs(int[][] grid, int[] start, boolean[][] visited, int path) {
        if (start[0] < 0 || start[1] < 0 || start[0] >= grid.length || start[1] >= grid[0].length 
            || grid[start[0]][start[1]] == -1) return;
        
        if (visited[start[0]][start[1]]) return;
        
        if (grid[start[0]][start[1]] == 2) {
            // System.out.println(path);
            if (path == count) res++;
            return;
        }
        visited[start[0]][start[1]] = true;
        for (int i = 0; i < dir.length; i++) {
            dfs(grid, new int[]{start[0] + dir[i][0], start[1] + dir[i][1]}, visited, path + 1);
        }    
        visited[start[0]][start[1]] = false;
    }
}
