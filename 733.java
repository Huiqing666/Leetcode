class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        boolean[][] visited = new boolean[image.length][image[0].length];
        if(newColor == image[sr][sc])
            return image;
    
        helper(image, sr, sc, newColor, image[sr][sc], visited);

        return image;
        
    }
    private void helper(int[][] image, int sr, int sc, int newcolor, int old, boolean[][] visited){
        if(visited[sr][sc]) return;
        visited[sr][sc] = true;
        image[sr][sc] = newcolor;
        if(sr - 1 >= 0 && image[sr-1][sc] == old) {
            helper(image, sr - 1, sc, newcolor, old, visited);
        }
        if(sr + 1 < image.length && image[sr+1][sc] == old) {
            helper(image, sr + 1, sc, newcolor, old, visited);
        }
        if(sc - 1 >= 0 && image[sr][sc-1] == old) {
           helper(image, sr, sc - 1, newcolor, old, visited);
        }
        if(sc + 1 < image[0].length && image[sr][sc+1] == old) {
            helper(image, sr, sc + 1, newcolor, old, visited);
        }
        

    }
}
