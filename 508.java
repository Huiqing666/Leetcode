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
    HashMap<Integer, Integer> map = new HashMap<>();
    public int[] findFrequentTreeSum(TreeNode root) {
        if (root == null) return new int[0];
        helper(root);
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> (b.getValue() - a.getValue()));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(entry);
        }
        List<Integer> list = new ArrayList<>();
        // System.out.println(pq.size());
        int max = pq.peek().getValue();
        while (!pq.isEmpty() && pq.peek().getValue() == max) {
            list.add(pq.poll().getKey());
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
    private int helper(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) {
            map.put(root.val, map.getOrDefault(root.val, 0) + 1);
            return root.val;
        }
        int left = helper(root.left);
        int right = helper(root.right);
        map.put(root.val + left + right, map.getOrDefault(root.val + left + right, 0) + 1);
        return root.val + left + right;
    }
    
}
