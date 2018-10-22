class Solution {
    public int uniquePaths(int m, int n) {
        int[][] mem = new int[m][n];
        return helper(0, 0, m - 1, n - 1, mem);
    }
    private int helper(int i , int j, int m , int n, int[][] mem) {
        if(i == m || j == n) return 1;
        if(mem[i][j] > 0) return mem[i][j];
        mem[i][j] = helper(i + 1, j, m, n, mem) + helper(i, j + 1, m, n, mem);
        return mem[i][j];
    }
}
