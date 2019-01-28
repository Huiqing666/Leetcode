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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        // inorder
        if (root == null) return new TreeNode(val);
        
        TreeNode curr = root;
        
        while (true) {
            if (curr.val <= val) {
                if (curr.right == null) {
                    curr.right = new TreeNode(val);
                    break;
                }
                else {
                    curr = curr.right;
                }
            }
            else {
                if (curr.left == null) {
                    curr.left = new TreeNode(val);
                    break;
                }
                else {
                    curr = curr.left;
                }
            }
            
        }
        return root;
            
        
    }
}
