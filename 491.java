class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res, new ArrayList<>(), 0, nums);
        return res;
    }
    
    private void helper(List<List<Integer>> res, List<Integer> temp, int index, int[] nums) {
        if (temp.size() > 1) {
            res.add(new ArrayList<>(temp));
        }
        if (index == nums.length) return;
        // temp.add(nums[index]);
        Set<Integer> set = new HashSet<>();
        for (int i = index; i < nums.length; i++) {
            if (temp.size() == 0 || nums[i] - temp.get(temp.size() - 1) >= 0) {
                if (set.contains(nums[i])) continue;
                temp.add(nums[i]);
                helper(res, temp, i + 1, nums);
                temp.remove(temp.size() - 1);
                set.add(nums[i]);
            }
        }
    }
}
