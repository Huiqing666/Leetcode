class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length == 0) return 0;
        int maxArea = 0;
        //int[] before = int[matrix[0].length];
        int[] curr = new int[matrix[0].length];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] - '0' == 1) {
                    curr[j]++;
                }else{
                    curr[j] = 0;
                }
            }
            maxArea = Math.max(maxArea, largestRectangleArea(curr));
        }
        return maxArea;
        
    }
    
    
    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        Stack<Integer> stack = new Stack<>();

        int maxArea = 0;
        for(int i = 0; i <=len; i++) {
            //System.out.print("i = " + i + ", ");
            int h = (i == len) ? 0: heights[i];
            //System.out.print("h = " + h + ", ");
            if(stack.isEmpty() || h >= heights[stack.peek()]){
                stack.push(i);

            }else{
                int tp = stack.pop();
                //System.out.print("tp = " + tp + ", ");
                maxArea = Math.max(maxArea, heights[tp] * (stack.isEmpty() ? i : i-1-stack.peek()));
                //System.out.print("maxArea = " + maxArea + ", ");
                i--;
            }
            //System.out.println();
        }
        return maxArea;
        
    }
}
