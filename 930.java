class Solution {
    public int numSubarraysWithSum(int[] A, int S) {
        Map<Integer, Integer> m = new HashMap(); 
        m.put(0, 1);
        int total = 0, res = 0;
        for (int i: A) {
            total += i;
            res += m.getOrDefault(total-S, 0);
            //System.out.println(res);
            m.put(total, m.getOrDefault(total, 0) + 1);
        }
        return res;
    }
}
