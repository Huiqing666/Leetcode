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
    List<List<Integer>> res;
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        res = new ArrayList<>();
        dfs(root, new ArrayList<Integer>(), sum);
        return res;
    }
    private void dfs(TreeNode curr, List<Integer> temp, int rem) {
        if (curr == null) return;
        temp.add(curr.val);
        if (rem == curr.val && curr.left == null && curr.right == null) {
            // temp.add(curr.val);
            res.add(new ArrayList<>(temp));
            // System.out.println(temp.get(temp.size()- 1));
            temp.remove(temp.size() - 1);
            return;
        }
        // System.out.println(curr.val);
        dfs(curr.left, temp, rem - curr.val);
        dfs(curr.right, temp, rem - curr.val);
        temp.remove(temp.size() - 1);
        
        
    }
}
