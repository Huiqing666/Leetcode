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
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {

        return helper(root, p);
    }
    private TreeNode helper(TreeNode root, TreeNode p) {
        if (root == null) return null;
        if (root.val <= p.val) return helper(root.right, p);
        // if (root.val < p.val) return helper(root.right, p);
        TreeNode left = helper(root.left, p);
        if (left != null) return left;
        else return root;
    }
}
