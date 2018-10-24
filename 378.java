class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        if(matrix.length == 0) return 0;
        int m = matrix.length, n = matrix[0].length;
        int left = matrix[0][0], right = matrix[m-1][n-1];
        while (left < right) {
            int mid = left + (right - left) / 2;
            //System.out.println(mid);
            int count = numOfLessOrEqual(matrix, mid);
            if(count < k) left = mid + 1;
            else{
                right = mid;
            }
        }
        return right;
        
    }
    private int numOfLessOrEqual(int[][] matrix, int target) {
        int i = 0, j = matrix[0].length - 1;
        int count = 0;
        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] <= target) {
                i++;
                count += j + 1;
            }
            else {
                j--;
            }
        }  
        return count;
    }
}
