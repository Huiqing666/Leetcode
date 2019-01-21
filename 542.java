class Solution {
    // BFS
    public int[][] updateMatrix(int[][] matrix) {
        Queue<int[]> q = new LinkedList<>();
        int[][] res = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    res[i][j] = 0;
                    q.add(new int[]{i, j});
                }
                else res[i][j] = Integer.MAX_VALUE;
            }
        }
        int[][] dir = new int[][]{{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            for (int i = 0; i < dir.length; i++) {
                int r = curr[0] + dir[i][0];
                int c = curr[1] + dir[i][1];
                if (r < 0 || c < 0 || r >= matrix.length || c >= matrix[0].length) continue;
                if (res[r][c] < res[curr[0]][curr[1]] + 1) {
                    continue;
                }
                else {
                    res[r][c] = res[curr[0]][curr[1]] + 1;
                }
                q.add(new int[]{r, c});
            }
        }
        return res;
    }
}
