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
    public TreeNode str2tree(String s) {
        if (s.length() == 0) return null;
        return helper(s, 0, s.length() - 1);
    }
    private TreeNode helper(String s, int start, int end) {
        if (start > end) return null;
        int i = start;
        while (i < end && s.charAt(i) != '(') {
            i++;
        }
        if (i == end) return new TreeNode(Integer.parseInt(s.substring(start, end + 1)));
        TreeNode curr = new TreeNode(Integer.parseInt(s.substring(start, i)));
        int count = 1;
        int j = i + 1;
        while (count != 0) {
            if (s.charAt(j) == ')') count--;
            else if (s.charAt(j) == '(') count++;
            j++;
        }
        curr.left = helper(s, i + 1, j - 2);
        curr.right = helper(s, j + 1, end - 1);
        return curr;
        
    }
}
