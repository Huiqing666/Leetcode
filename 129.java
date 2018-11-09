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
    public int sumNumbers(TreeNode root) {
        ArrayList<Integer> leaf = new ArrayList<>();
        dfs(root, 0, leaf);
        int sum = 0;
        for(int i : leaf) {
            sum += i;
        }
        return sum;
    }
    private void dfs(TreeNode root, int prev, ArrayList<Integer> leaf) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            leaf.add(prev * 10 + root.val);
            return;
        }
        dfs(root.left, prev * 10 + root.val, leaf);
        dfs(root.right, prev * 10 + root.val, leaf);
    }
}
