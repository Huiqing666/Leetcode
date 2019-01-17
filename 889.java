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
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        if (pre.length == 0) return null;
        return helper(pre, post, 0, pre.length - 1, 0, post.length - 1);
    }
    private TreeNode helper(int[] pre, int[] post, int preStart, int preEnd, int postStart, int postEnd) {
        if (preStart > preEnd || postStart > preEnd) return null;
        if (preStart == preEnd) return new TreeNode(pre[preStart]);
        TreeNode curr = new TreeNode(pre[preStart]);
        int n = 0;
        for (int i = postStart; i < postEnd; i++) {
            if (post[i] != pre[preStart + 1]) n++;
            else break;
        }
        System.out.println(n + " " + preStart);
        curr.left = helper(pre, post, preStart + 1, preStart + n + 1, postStart, postStart + n);
        curr.right = helper(pre, post, preStart + n + 2, preEnd, postStart + n + 1, postEnd - 1);
        return curr;
    }
}
