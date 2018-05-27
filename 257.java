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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<String>();
        if(root == null) return res;
        if(root.left == null && root.right == null){
            res.add(Integer.toString(root.val));
        }
        for(String s : binaryTreePaths(root.left)){
            res.add(Integer.toString(root.val) + "->" + s);
        }
        for(String s : binaryTreePaths(root.right)){
            res.add(Integer.toString(root.val) + "->" + s);
        }
        return res;
        
    }    

}
