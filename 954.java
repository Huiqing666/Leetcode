class Solution {
    public boolean canReorderDoubled(int[] A) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int a : A) {
            if (!map.containsKey(a)) map.put(a, 0);
            map.put(a, map.get(a) + 1);
        }
        while (!map.isEmpty()) {
            int a = map.firstKey();
            if (a == 0) {
                map.remove(a);
                continue;
            }
            int b = a * 2;
            if (a < 0) {
                if (a % 2 == 1) return false;
                b = a / 2;

            }
            if (!map.containsKey(b)) return false;
            if (map.get(b) < map.get(a)) return false;
            int k = map.get(a);
            if (map.get(b) == k) map.remove(b);
            else {
                map.put(b, map.get(b) - k);
            }
            map.remove(a);
        }
        return true;
        
    }
}
