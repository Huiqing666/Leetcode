class Solution {
    
    int[][] dir = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    
    public int shortestDistance(int[][] maze, int[] start, int[] destination) {
        int[][] dist = new int[maze.length][maze[0].length];
        dist[start[0]][start[1]] = 1;
        helper(maze, start, destination, dist);
        return dist[destination[0]][destination[1]] - 1;
    }
    
    private void helper(int[][] maze, int[] s, int[] d, int[][] dist) {
        if (s[0] == d[0] && s[1] == d[1]) {
            // System.out.println(dist[d[0]][d[1]]);
            return;
        }
        for (int i = 0; i < 4; i++) {
            int curr = dist[s[0]][s[1]];
            int row = s[0], col = s[1];
            while (row + dir[i][0]>= 0 && col + dir[i][1] >= 0 
                   && row + dir[i][0] < maze.length && col + dir[i][1] < maze[0].length
                   && maze[row + dir[i][0]][col + dir[i][1]] == 0) {
                row += dir[i][0];
                col += dir[i][1];
                curr++;
            }
            
            if (dist[row][col] > 0 && dist[row][col] <= curr) continue;
            dist[row][col] = curr;
            
            helper(maze, new int[]{row, col}, d, dist);
        }
            
    }
}
