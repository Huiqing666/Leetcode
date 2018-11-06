class Solution {
    public int networkDelayTime(int[][] times, int N, int K) {
        // dijkstra algorithm
        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
        for (int i = 0; i < times.length; i++) {
            HashMap<Integer, Integer> temp = map.getOrDefault(times[i][0], new HashMap<Integer, Integer>());
            temp.put(times[i][1], times[i][2]);
            map.put(times[i][0], temp);
        }
        // length
        HashMap<Integer, Integer> distance = new HashMap<Integer, Integer>();
        distance.put(K, 0);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[1] - b[1]));
        pq.offer(new int[]{K, 0});
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            HashMap<Integer, Integer> source = map.get(curr[0]);
            if (source == null) continue;
            if (distance.containsKey(curr[0]) && distance.get(curr[0]) < curr[1]) {
                continue;
            }
            for (Map.Entry<Integer, Integer> entry : source.entrySet()) {
                int total = curr[1] + entry.getValue();
                int vertex = entry.getKey();
                if(!distance.containsKey(vertex) || distance.get(vertex) > total) {
                    distance.put(vertex, total);
                    pq.offer(new int[]{vertex, total}); 
                }
            }
        }

        int max = 0;
        for (Integer i : distance.keySet()) {
            //System.out.println(i);
            max = Math.max(distance.get(i), max);
        }
        return distance.size() == N ? max : -1;
        
        
    }
}
