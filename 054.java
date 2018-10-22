class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if(matrix.length == 0) return list;
        int len = Math.min((matrix.length+1)/2, (matrix[0].length+1)/2);
        for (int i = 0; i < len; i++) {
            //System.out.println(i);
            circle(matrix, i, i, list);  
        }
        return list;
        
    }
    private void circle(int[][] matrix, int m, int n, List<Integer> list) {
        for (int i = n; i < matrix[0].length - n; i++) {
            list.add(matrix[m][i]);
        }
        for (int i = m+1; i < matrix.length - m; i++) {
            list.add(matrix[i][matrix[0].length - n -1]);
            
        }
        for (int i = matrix[0].length - m -2; i >= n; i--) {
            if(matrix.length - m - 1 > m)list.add(matrix[matrix.length - m -1][i]);
        }
        for (int i = matrix.length - n -2; i > m; i--) {
            if(n < matrix[0].length-n-1)list.add(matrix[i][n]);
            
        }
            
    }
}
