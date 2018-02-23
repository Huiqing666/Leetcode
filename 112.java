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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)return false;
        if((root.right == null) && (root.left == null) && (sum - root.val == 0))return true;
         return hasPathSum(root.left, sum - root.val) ||hasPathSum(root.right, sum - root.val);
            
        
        /*
        Stack<TreeNode> visited = new Stack<TreeNode>();
        Stack<Integer> total = new Stack<Integer>();
        if(root == null)return false;
        visited.push(root);
        total.push(root.val);
        HashMap<TreeNode,Boolean> mark = new HashMap<TreeNode,Boolean>();
        TreeNode v;
        while(!visited.isEmpty()){
            v = visited.pop();
            //System.out.println(v.val);
            if(!mark.getOrDefault(v,false)){
                mark.put(v,true);
                int temp = total.pop();
                if(v.right!=null){
                    visited.push(v.right);
                    total.push(temp + v.right.val);
                }
                if(v.left!=null){
                    visited.push(v.left);
                    total.push(temp + v.left.val);
                }
                if(v.left == null && v.right == null){
                    if(temp == sum)return true;
                }
            }
        }
        return false;
        */
        
        
    }
}
