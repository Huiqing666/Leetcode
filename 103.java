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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return res;
        q.offer(root);
        boolean reverse = false;
        while(!q.isEmpty()) {
            int n = q.size();
            List<Integer> list = new ArrayList<Integer>();
            for(int i = 0; i < n; i++) {
                TreeNode temp = q.poll();
                list.add(temp.val);
                if(temp.left != null) q.offer(temp.left);
                if(temp.right != null) q.offer(temp.right);
            }
            if(reverse){
                Collections.reverse(list);
            }
            res.add(list);
            reverse = !reverse;
        }
        return res;
    }
}
