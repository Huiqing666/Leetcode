class Solution {
    public int[][] multiply(int[][] A, int[][] B) {
        int row = A.length, col = B[0].length, mid = A[0].length;
        int[][] res = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < mid; j++) {
                if (A[i][j] != 0) {
                    for (int k = 0; k < col; k++) {
                        if (B[j][k] != 0) res[i][k] += A[i][j] * B[j][k];
                    }
                }
                
            }
        }
        return res;
    }
}
