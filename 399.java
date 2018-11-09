class Solution {
    
    class Node {
        String vertex;
        HashMap<String, Double> edges;
        Node(String s) {
            this.vertex = s;
            edges = new HashMap<>();
        }
        public void addEdge(String s, double d) {
            edges.put(s, d);
        }
    }
    HashMap<String, Node> map = new HashMap<>();
    double[] res;
    public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
        // build the graph
        for (int i = 0; i < values.length; i++) {
            map.putIfAbsent(equations[i][0], new Node(equations[i][0]));
            HashMap<String, Double> edge = map.get(equations[i][0]).edges;
            edge.put(equations[i][1], values[i]);
            map.putIfAbsent(equations[i][1], new Node(equations[i][1]));
            HashMap<String, Double> edge2 = map.get(equations[i][1]).edges;
            edge2.put(equations[i][0], 1/values[i]);
            
            
        }
        res = new double[queries.length];
        Arrays.fill(res, -1);
        for (int i = 0; i < queries.length; i++) {
            if (queries[i][0].equals(queries[i][1]) && map.containsKey(queries[i][0])) res[i] = 1.0;
            else dfs(queries[i][0], queries[i][1], 1.0, i, new HashSet<String>());
        } 
        return res;
    }
    private void dfs(String s, String t, double prev, int i, HashSet<String> visited) {
        if (!map.containsKey(s)) return;
        if (s.equals(t)) {
            res[i] = prev;
            //System.out.println(res[i]);
            return;
        }
        visited.add(s);
        HashMap<String, Double> edge = map.get(s).edges;
        for(String key : edge.keySet()) {
            if (visited.contains(key)) continue;
            dfs(key, t, prev * edge.get(key), i, visited);
        }
    }
}
