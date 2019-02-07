class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ans : answers) {
            map.put(ans, map.getOrDefault(ans, 0) + 1);
        }
        int res = 0;
        for (Integer n : map.keySet()) {
            res += (n + 1) * ((map.get(n) + n) / (n + 1));
            // System.out.println(res);
        }
        return res;
    }
}
