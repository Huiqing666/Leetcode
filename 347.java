class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for(int n : nums) {
            frequency.put(n, frequency.getOrDefault(n, 0) + 1);
        }
        ArrayList<Integer>[] bucket = new ArrayList[nums.length+1];
        for(int key: frequency.keySet()) {
            int f = frequency.get(key);
            if(bucket[f] == null) {
                bucket[f] = new ArrayList<Integer>();
            }
            bucket[f].add(key);
        }
        for(int i = nums.length; i >= 1; i--) {
            if(bucket[i] != null) {
                list.addAll(bucket[i]);
            }
            if(list.size() >= k)break;
        }
        return list;
        
        
    }
}
