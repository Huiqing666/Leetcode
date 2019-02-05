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
    Integer pre = null;
    int min = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        inOrder(root);
        return min;
    }
    private void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        if (pre == null) pre = root.val;
        else {
            min = Math.min(root.val - pre, min);
            pre = root.val;
        }
        
        inOrder(root.right);
    }
}
