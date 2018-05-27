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
    public int max = 0;
    public int longestConsecutive(TreeNode root) {
        if(root == null) return 0;
        return Math.max(helper(root.left, root.val + 1, 1), helper(root.right, root.val + 1, 1));
    }
    private int helper(TreeNode root, int target, int res){
        if(root == null) return res;
        if(root.val == target){
            max = res + 1;
            return Math.max(max, Math.max(helper(root.left, root.val + 1, res + 1), helper(root.right, root.val + 1, res + 1)));
        }
        else
            return Math.max(helper(root.left, root.val + 1, 1), helper(root.right, root.val + 1, 1));
    }
    /*
        if(root == null) return max;
        if(root.left == null && root.right == null) return Math.max(max, 1);
        if(root.left == null){
            if(root.right.val != root.val + 1){
                return Math.max(max, longestConsecutive(root.right));
            }else{
                return Math.max(max, 1 + longestConsecutive(root.right));
            }
        }
        if(root.right == null){
            if(root.right.val != root.val + 1){
                return Math.max(max, longestConsecutive(root.left));
                
            }else{
                return Math.max(max, 1 + longestConsecutive(root.left));
            }
        }
        return max;
    */
    
}
