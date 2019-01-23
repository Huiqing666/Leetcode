class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        //ArrayList<Integer> nodes = new ArrayList<Integer>();
        int[] nodes = new int[edges.length+1];
        for(int i = 0; i < nodes.length; i++) {
            nodes[i] = i;
        }
        for (int i = 0; i < edges.length; i++) {
            if(!union(nodes, edges[i][0], edges[i][1])) return edges[i];
        }
        return new int[2];
        
    }
    private int root(int[] nodes, int child) {
        while (nodes[child] != child) {
            child = nodes[child];
        }
        return child;
    }
    private boolean union(int[] nodes, int left, int right) {
        int l = root(nodes, left);
        int r = root(nodes, right);
        if (l == r) return false;
        nodes[l] = r;
        return true;
    }
}
