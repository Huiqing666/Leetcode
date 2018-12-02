class Solution {
    public int minAreaRect(int[][] points) {
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        for (int[] point : points) {
            HashSet<Integer> set = map.getOrDefault(point[0], new HashSet<Integer>());
            set.add(point[1]);
            map.put(point[0], set);
        }
        int min = Integer.MAX_VALUE;
        for (int[] a : points) {
            for (int[] b : points) {
                if (a[0] == b[0] || a[1] == b[1]) continue;
                if (map.get(a[0]).contains(b[1]) && map.get(b[0]).contains(a[1])) {
                    min = Math.min(min, Math.abs(a[1] - b[1]) * Math.abs(a[0] - b[0]));
                }
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
        
    }
}
