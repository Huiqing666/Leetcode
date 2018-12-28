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
    int max = 0;
    public int maxPathSum(TreeNode root) {
        max = root.val;
        helper(root);
        return max;
    }
    private int helper(TreeNode root) {
        if (root == null) return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        max = Math.max(max, left + right + root.val);
        return Math.max(0, Math.max(left, right) + root.val);
    }
}
