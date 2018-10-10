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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int n = queue.size();
            long sum = 0;
            for(int i = 0; i < n; i++) {
                TreeNode c = queue.poll();
                sum += c.val;
                if(c.left != null) queue.offer(c.left);
                if(c.right != null) queue.offer(c.right);
            }
            res.add((double)sum/n);
        }
        return res;
    }
}
