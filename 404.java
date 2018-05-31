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
    public int sumOfLeftLeaves(TreeNode root) {
        //BFS
        if(root == null) return 0;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        int sum = 0;
        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            if(temp.left != null) {
                if(temp.left.left == null && temp.left.right == null)sum += temp.left.val;
                q.add(temp.left);
            }
            
            if(temp.right != null) q.add(temp.right);
        }
        return sum;
        
        
    }
}
