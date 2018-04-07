class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //binary search in column
        if(matrix.length == 0 || matrix[0].length == 0)return false;
        int hi = matrix.length - 1, mid = 0, low = 0;
        int len = matrix[0].length - 1;
        
        while(low <= hi) {
            mid = (low + hi) / 2;
            System.out.println("first");
            if(matrix[mid][0] > target) hi = mid - 1;
            else if(matrix[mid][len] < target) low = mid + 1;
            else break;
            
        }
        //binary search in row
        hi = len;
        low = 0;
        int mid2 = 0;
        while(low <= hi) {
            mid2 = (low + hi) / 2;
            System.out.println("second:" + mid2);
            if(matrix[mid][mid2] < target) low = mid2 + 1;
            else if(matrix[mid][mid2] > target) hi = mid2 - 1;
            else return true;
        }
        return false;
    }
}
