class Solution {
    public int tallestBillboard(int[] rods) {
        // diff, max Sum pair = s (s, diff + s)
        // 0, 6
        
        Map<Integer, Integer> dp = new HashMap<>(), cur;
        dp.put(0, 0);
        for (int x : rods) {
            cur = new HashMap<>(dp);
            for (int d : cur.keySet()) {
                dp.put(d + x, Math.max(cur.get(d), dp.getOrDefault(x + d, 0))); //set 1
                dp.put(Math.abs(d - x), Math.max(cur.get(d) + Math.min(d, x), dp.getOrDefault(Math.abs(d - x), 0))); // set 2
                //set 3, d
            }
        }
        return dp.get(0);
        // 1 2 3 6
        // 0,0
        // 0,0 1,0
        // 0,0 1,1 2,0
        // 0,3 1,1 2,1 3,0 
        
    }
}
