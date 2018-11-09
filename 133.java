/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    HashMap<Integer, UndirectedGraphNode> map;
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        map = new HashMap<>();
        UndirectedGraphNode n = clone(node);
        return n;
    }
    private UndirectedGraphNode clone(UndirectedGraphNode node) {
        if (node == null) return null;
        if (map.containsKey(node.label)) {
            return map.get(node.label);
        }
        UndirectedGraphNode newNode = new UndirectedGraphNode(node.label);
        map.put(node.label, newNode);
        List<UndirectedGraphNode> list = node.neighbors;
        for (int i = 0; i < list.size(); i++) {
            newNode.neighbors.add(clone(list.get(i)));
        }
        
        return newNode;
    }
}
