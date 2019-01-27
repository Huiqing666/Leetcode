class TimeMap {

    /** Initialize your data structure here. */
    HashMap<String, TreeMap<Integer, String>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        TreeMap<Integer, String> tree = map.getOrDefault(key, new TreeMap<>());
        tree.put(timestamp, value);
        map.put(key, tree);
    }
    
    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) return "";
        TreeMap<Integer, String> tree = map.get(key);
        if (tree.floorKey(timestamp) == null) return "";
        
        int pre = tree.floorKey(timestamp);
        return tree.get(pre);
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
