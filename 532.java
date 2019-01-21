class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int count = 0;
        Set<Integer> keys = map.keySet();
        for (int n : keys) {
            if (k == 0) {
                if (map.get(n) > 1) count++;
            }
            else {
                if (keys.contains(n + k)) count++;
            }
        }
        return count;
        
    }
}
