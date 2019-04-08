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
    public int sumRootToLeaf(TreeNode root) {
        if (root == null) return 0;
        helper(root, 0);
        return sum;
        
        
    }
    int sum = 0;
    private void helper(TreeNode root, int pre) {
        if (root == null) return;
        pre = 2 * pre + root.val;
        if (root.left == null && root.right == null) sum += pre;
        
        helper(root.left, pre);
        helper(root.right, pre);
    }
}
