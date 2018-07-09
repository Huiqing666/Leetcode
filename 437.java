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
    public int pathSum(TreeNode root, int sum) {
        if(root == null) return 0;
        return calPathSum(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }
    private int calPathSum(TreeNode root, int sum) {
        if(root == null) return 0;
        return (root.val == sum ? 1 : 0) + calPathSum(root.left, sum - root.val) + calPathSum(root.right, sum - root.val);
    }
} 
