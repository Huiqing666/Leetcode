class Solution {
    public boolean canCross(int[] stones) {
        if (stones.length < 2) return true;
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        int last = stones[stones.length - 1];
        map.put(0, new HashSet<>());
        map.get(0).add(1);
        for (int i = 1; i < stones.length; i++) {
            map.put(stones[i], new HashSet<>());
        }
        for (int i = 0; i < stones.length; i++) {
            int stone = stones[i];
            for (int step : map.get(stone)) {
                int reach = step + stone;
                if (reach == last) return true;
                HashSet<Integer> set = map.get(reach);
                if (set != null) {
                    set.add(step);
                    if (step > 1) set.add(step - 1);
                    set.add(step + 1);
                    map.put(reach, set);
                }
            }
        }
        return false;
    }
}
