class Logger {
    TreeMap<Integer, List<String>> map;
    /** Initialize your data structure here. */
    public Logger() {
        map = new TreeMap<>();
    }
    
    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
        If this method returns false, the message will not be printed.
        The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        
        while (!map.isEmpty() && map.firstKey() + 10 <= timestamp) {
            int first = map.firstKey();
            map.remove(first);
        }
        for (int i : map.keySet()) {
            List<String> list = map.get(i);
            if (list.contains(message)) return false;
        }
        List<String> temp = map.getOrDefault(timestamp, new ArrayList<>());
        temp.add(message);
        map.put(timestamp, temp);
        return true;
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */
