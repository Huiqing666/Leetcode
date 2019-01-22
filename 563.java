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
    int sum = 0;
    public int findTilt(TreeNode root) {
        nodeSum(root);
        return sum;
    }
    private int nodeSum(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return root.val;
        int left = nodeSum(root.left);
        int right = nodeSum(root.right);
        sum += Math.abs(left-right);
        return root.val + left + right;
    }
}
