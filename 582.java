class Solution {
    class Node {
        int v;
        List<Node> edge;
        Node(int v) {
            this.v = v;
            edge = new ArrayList<Node>();
        }
        public void addEdge(Node i) {
            edge.add(i);
        }
    }
    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        HashMap<Integer, Node> map = new HashMap<>();
        Node root = new Node(0);
        map.put(0, root);
        // construct the root;
        for (int i = 0; i < ppid.size(); i++) {
            Node temp = map.getOrDefault(ppid.get(i), new Node(ppid.get(i)));
            Node child = map.getOrDefault(pid.get(i), new Node(pid.get(i)));
            temp.addEdge(child);
            map.put(ppid.get(i), temp);
            map.put(pid.get(i), child);
        }
        Node k = map.get(kill);
        List<Integer> res = new ArrayList<>();
        
        Queue<Node> q = new LinkedList<Node>();
        q.add(k);
        while (!q.isEmpty()) {
            Node c = q.poll();
            res.add(c.v);
            List<Node> edges = c.edge;
            for (int i = 0; i < edges.size(); i++) {
                q.add(edges.get(i));
            }
        }
        
        return res;
    }

}
