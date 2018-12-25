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
    public boolean isCompleteTree(TreeNode root) {
        if (root == null) return true;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int level = 0;
        boolean leaf = false;
        while (!q.isEmpty()) {
            level++;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
                if (leaf) {
                    if (node.left != null || node.right != null) return false;
                }
                if (node.left == null || node.right == null) {
                    if (node.left == null && node.right != null) return false;
                    leaf = true;
                }
            }
            
        }
        return true;
        
        
    }
}
