class Solution {
    int n = 1;
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int len = (n+1)/2;
        for (int i = 0; i < len; i++) {
            circle(res, i);  
        }
        return res;
    }
    private void circle(int[][] matrix, int k) {
        for (int i = k; i < matrix.length - k; i++) {
            matrix[k][i] = n++;
        }
        for (int i = k+1; i < matrix.length - k; i++) {
            matrix[i][matrix.length - k -1] = n++;
            
        }
        for (int i = matrix.length - k -2; i >= k; i--) {
            if(matrix.length - k - 1 > k) matrix[matrix.length - k -1][i] = n++;
        }
        for (int i = matrix.length - k -2; i > k; i--) {
            if(k < matrix.length-k-1) matrix[i][k] = n++;
            
        }
            
    }
}
