/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        helper(list, root);
        return list;
        
    }
    private void helper(List<Integer> list, Node root) {
        List<Node> c = root.children;
        for(int i = 0; i < c.size(); i++) {
            helper(list, c.get(i));
        }
        list.add(root.val);
    }
}
