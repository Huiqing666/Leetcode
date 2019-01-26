/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode newRoot = new TreeNode(0);
    TreeNode curr = newRoot;
    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        return newRoot.right;
    }
    public void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        curr.right = new TreeNode(root.val);
        curr = curr.right;
        inorder(root.right);
    }
}
