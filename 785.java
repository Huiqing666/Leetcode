class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] color = new int[graph.length];
        
        for (int i = 0; i < graph.length; i++) {
            if (color[i] == 0 && !validColor(graph, color, i, 1)) return false;
        }
        
        return true;
    }
    
    private boolean validColor(int[][] graph, int[] color, int i, int c) {
        
        if (color[i] != 0) {
            return color[i] == c;
        }
        color[i] = c;
        for (int j = 0; j < graph[i].length; j++) {
            if (!validColor(graph, color, graph[i][j], -c)) return false;
        }
        return true;
        
    }
}
