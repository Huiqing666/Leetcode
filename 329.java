class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        if (matrix.length == 0) return 0;
        int maxPath = 0;
        int[][] mem = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                maxPath = Math.max(maxPath, dfs(matrix, i, j, null, mem));
            }
        }
        return maxPath; 
    }
    
    private int dfs(int[][] matrix, int i, int j, Integer prev, int[][] mem) {
        //break condition
        if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || (prev != null && matrix[i][j] <= prev.intValue())) { 
            return 0;
        }
        //mem[i][j] > 0
        if (mem[i][j] > 0) return mem[i][j];
        mem[i][j] = Math.max(1+dfs(matrix, i+1, j, new Integer(matrix[i][j]), mem), 
                           Math.max(1+dfs(matrix, i-1, j, new Integer(matrix[i][j]), mem), 
                                   Math.max(1+dfs(matrix, i, j+1, new Integer(matrix[i][j]), mem), 
                                               1+dfs(matrix, i, j-1, new Integer(matrix[i][j]), mem))));
        //System.out.println(i + " " + j + " " + mem[i][j]);
        return mem[i][j];
        
    }
}
