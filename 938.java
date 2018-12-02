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
    public int rangeSumBST(TreeNode root, int L, int R) {
        addValue(root, L, R);
        return sum;
        
        
    }
    private void addValue(TreeNode node, int L, int R) {
        if (node == null) return;
        if (node.val >= L && node.val <= R) {
            sum += node.val;
        }
        addValue(node.left, L, R);
        addValue(node.right, L, R);
    }
}v
