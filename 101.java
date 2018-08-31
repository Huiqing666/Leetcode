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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return subSymmetric(root.left, root.right);
        
    }
    private boolean subSymmetric(TreeNode left, TreeNode right) {
        if(left == null || right == null) {
            return left == right;
        }
        if(left.val != right.val) {
            return false;
        }
        return subSymmetric(left.left, right.right) && subSymmetric(left.right, right.left);
    }
}
