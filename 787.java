class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
        for (int[] flight : flights) {
            map.putIfAbsent(flight[0], new HashMap<>());
            map.get(flight[0]).put(flight[1], flight[2]);
        }
        // price, source, stop
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a, b) -> (a[0] - b[0]));
        pq.offer(new int[]{0, src, K + 1});
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            if (curr[1] == dst) return curr[0];
            Map<Integer, Integer> neigh = map.get(curr[1]);
            if (neigh == null) continue;
            for (int i : neigh.keySet()) {
                if (curr[2] > 0) pq.offer(new int[]{neigh.get(i) + curr[0], i, curr[2] - 1});
            }
        }
        return -1;
    }
}
