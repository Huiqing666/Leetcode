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
    public TreeNode convertBST(TreeNode root) {
        greaterSum(root);
        return root;
    }
    private void greaterSum(TreeNode root) {
        if (root == null) return;
        greaterSum(root.right);
        sum += root.val;
        root.val = sum;
        greaterSum(root.left);

    }
}
