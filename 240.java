class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;
        int col = matrix[0].length;
        int colLimit = col;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = col - 1; j >= 0; j--) {
                System.out.println(matrix[i][j]);
                if(matrix[i][j] == target) return true;
                if(matrix[i][j] < target) {
                    break;
                }
                if(matrix[i][j] > target){
                    col--;
                    i--;
                    break;
                }
            }
        }
        
        return false;
        
    }
}
