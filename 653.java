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
    HashSet<Integer> set = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        return dfs(root, k);
        
    }
    private boolean dfs(TreeNode root, int k) {
        if (root == null) return false;
        if (!set.isEmpty() && set.contains(k - root.val)) {
            return true;
        }
        set.add(root.val);
        return dfs(root.left, k) || dfs(root.right, k);
    }
}
