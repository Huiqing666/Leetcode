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
    Integer kth = null;
    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return kth;
    }
    private void inorder(TreeNode root, int k) {
        if (root == null || kth != null) return;
        inorder(root.left, k);
        count++;
        if (count == k) kth = root.val;
        inorder(root.right, k);
    }
}
