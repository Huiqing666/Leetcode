class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        helper(0, k, n, new ArrayList<Integer>(), res);
        return res;
    }
    private void helper(int sum, int k, int n, ArrayList<Integer> temp, List<List<Integer>> res) {
        if (sum == n && temp.size() == k) {
            res.add(new ArrayList<Integer>(temp));
            return;
        }
        int i = temp.size() == 0 ? 1 : temp.get(temp.size() - 1) + 1;
        for (; i <= 9; i++) {
            if (sum + i <= n && temp.size() < k && !temp.contains(i)) {
                temp.add(i);
                helper(sum + i, k, n, temp, res);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
