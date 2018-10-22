class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : words) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
            (a, b) -> (a.getValue() == b.getValue() ? b.getKey().compareTo(a.getKey()) : a.getValue() - b.getValue()));
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            pq.offer(entry);
            if(pq.size() > k) pq.poll();
        }
        List<String> list = new ArrayList<String>();
        while(pq.size() > 0) {
            list.add(0, pq.poll().getKey());
        }
        return list;
        
        
    }
}
