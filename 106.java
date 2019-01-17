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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0) return null;
        return helper(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1);
        
    }
    private TreeNode helper(int[] inorder, int[] postorder, int inStart, int inEnd, int postStart, int postEnd) {
        if (inStart > inEnd || postStart > postEnd) return null;
        if (postStart == postEnd) return new TreeNode(postorder[postEnd]);
        TreeNode curr = new TreeNode(postorder[postEnd]);
        int n = 0;
        for (int i = inStart; i < inEnd; i++) {
            if (inorder[i] == postorder[postEnd]) break;
            else n++;
        }
        curr.left = helper(inorder, postorder, inStart, inStart + n - 1, postStart, postStart + n - 1);
        curr.right = helper(inorder, postorder, inStart + n + 1, inEnd, postStart + n, postEnd - 1);
        return curr;
    }
}
