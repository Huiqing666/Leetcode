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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // if (preorder.length == 0) return null;
        return helper(preorder, inorder, 0, 0, inorder.length - 1);
    }
    private TreeNode helper(int[] preorder, int[] inorder, int prestart, int instart, int inend) {
        if (prestart >= preorder.length || instart > inend) return null;
        if (instart == inend) return new TreeNode(preorder[prestart]);

        TreeNode curr = new TreeNode(preorder[prestart]);
        int n = 0;
        for (int i = instart; i < inend; i++) {
            if (inorder[i] != preorder[prestart]) n++;
            else break;
        }
        
        curr.left = helper(preorder, inorder, prestart + 1, instart, instart + n - 1);
        curr.right = helper(preorder, inorder, prestart + n + 1, instart + n + 1, inend);
            
        return curr;
        
    }
}
