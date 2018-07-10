class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int col = A[0].length;
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < col/2; j++) {
                int temp = A[i][j];
                A[i][j] = A[i][col-j-1];
                A[i][col-j-1] = temp;
            }
        }
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < col; j++) {
                if(A[i][j] == 0) A[i][j] = 1;
                else A[i][j] = 0;
            }
        }

        
        return A;
        
    }
}
