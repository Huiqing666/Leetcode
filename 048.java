class Solution {
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length/2; i++) {
            for (int j = i; j < matrix.length - i -1; j++) {
                helper(matrix, i, j);
            }
        }
        
    }
    private void helper(int[][] matrix, int i , int j) {
        int temp = matrix[i][j];
        int n = matrix.length;
        matrix[i][j] = matrix[n-j-1][i];
        matrix[n-j-1][i] = matrix[n-i-1][n-j-1];
        matrix[n-i-1][n-j-1] = matrix[j][n-i-1];
        matrix[j][n-i-1] = temp;
    }
}
