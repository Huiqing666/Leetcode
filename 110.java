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
    private boolean result = true;

    public boolean isBalanced(TreeNode root) {
        maxDepth(root);
        return result;
    }

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        //System.out.println("root=" + root.val);
        //System.out.println(l);
        //System.out.println(r);
        if (Math.abs(l - r) > 1)
            result = false;
        return 1 + Math.max(l, r);
    }
}
