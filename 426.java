/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/
class Solution {
    Node prev;
    public Node treeToDoublyList(Node root) {
        if(root == null) return root;
        //inorder traversal, root, left, right
        Node dummy = new Node(0, null, null);
        prev = dummy;
        helper(root);
        //connect head and tail
        prev.right = dummy.right;
        System.out.println(prev.right.val);
        dummy.right.left = prev;
        return dummy.right;
        
    }
    private void helper (Node root) {
        if (root == null) return;
        helper(root.left);
        prev.right = root;
        root.left = prev;
        prev = root;
        
        helper(root.right);
    }
}
