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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        Queue<TreeNode> temp = new LinkedList<TreeNode>();
        if(root == null)return res;
        temp.add(root);
        while(!temp.isEmpty()){
            int size = temp.size(); 
            List<Integer> first = new ArrayList<Integer>();
            for(int i = 0; i < size; i++){
                TreeNode a = temp.poll();
                first.add(a.val);
                //System.out.println(a.val);          
                if(a.left != null){
                    temp.add(a.left);
                 }
                if(a.right != null){
                    temp.add(a.right);
                 }
            }
            res.add(0, first);
            //System.out.println("*************");
        }   
        return res;    
    }
}
