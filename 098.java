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
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> sta = new Stack<TreeNode>();
        ArrayList<TreeNode> arr = new ArrayList<TreeNode>();
        int i = 0;
        TreeNode p = root;
        //inorder traverse
        while(p != null || sta.size() > 0){
            while(p != null){
                sta.push(p);
                p = p.left;
            }
            if(sta.size() > 0){
                p = sta.pop();
                arr.add(p);
                p = p.right;
            }
        }
        int len = arr.size();
        for(int j = 0; j < len-1;j++){
            if(arr.get(j).val >= arr.get(j+1).val)return false;
        }
        return true;
         /*
        if(root == null)return true;
        if(root.right != null){
            if(root.right.val <= root.val)return false;
            else return isValidBST(root.right);
        }
        if(root.left != null){
            if(root.left.val >= root.val)return false;
            else return isValidBST(root.left);
        }
        return true;
        */
    }

}
