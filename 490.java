class Solution {
    public boolean hasPath(int[][] maze, int[] start, int[] destination) {
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        visited[destination[0]][destination[1]] = true;
        if (maze[destination[0]][destination[1]] == 1) return false;
        for (int i = 0; i < 4; i++) {
            helper(maze, start, destination, dir[i], visited);
        }
        return has;
    }
    int[][] dir = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    boolean has = false;
    private void helper(int[][] maze, int[] s, int[] d, int[] direction, boolean[][] visited) {
        if (has) {
            return;
        }
        if (maze[s[0]][s[1]] == 1) return;
        // System.out.println(s[0] + " " + s[1] + direction[0] + " " + direction[1]);
        s[0] += direction[0];
        s[1] += direction[1];
        if (s[0] < 0 || s[1] < 0 || s[0] >= maze.length || s[1] >= maze[0].length || maze[s[0]][s[1]] == 1) {
            // change direction
            s[0] -= direction[0];
            s[1] -= direction[1];
            
            if (s[0] == d[0] && s[1] == d[1]) {
                has = true;
                return;
            }
            if (visited[s[0]][s[1]]) return;
            visited[s[0]][s[1]] = true;
            for (int i = 0; i < 4; i++) {
                if (dir[i][0] == -direction[0] && dir[i][1] == -direction[1]){
                    continue;
                }
                s[0] += dir[i][0];
                s[1] += dir[i][1];
                if (s[0] >= 0 && s[1] >= 0 && s[0] < maze.length && s[1] < maze[0].length) {
                    helper(maze, s, d, dir[i], visited);
                }
                s[0] -= dir[i][0];
                s[1] -= dir[i][1];
            }

        }
        else {
            helper(maze, s, d, direction, visited);
            s[0] -= direction[0];
            s[1] -= direction[1];
        }
    }
}
