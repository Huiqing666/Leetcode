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
    public int countUnivalSubtrees(TreeNode root) {
        if(root==null) return 0;
        if(isUni(root, root.val)) {
            return count(root);
        }
        else return countUnivalSubtrees(root.left) + countUnivalSubtrees(root.right);
        
        
    }
    private int count(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        return 1 + count(root.left) + count(root.right);
    }
    private boolean isUni(TreeNode root, int value) {
        if (root == null) return true;
        if (root.val != value) return false;
        return isUni(root.left, value) && isUni(root.right, value);
        
    }
}
