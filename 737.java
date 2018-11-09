class Solution {
    HashMap<String, Set<String>> map = new HashMap<>();
    boolean similar = false;
    public boolean areSentencesSimilarTwo(String[] words1, String[] words2, String[][] pairs) {
        if (words1.length != words2.length) return false;
        
        for (String[] pair : pairs) {
            map.putIfAbsent(pair[0], new HashSet<>());
            map.putIfAbsent(pair[1], new HashSet<>());
            map.get(pair[0]).add(pair[1]);
            map.get(pair[1]).add(pair[0]);
        }
        for (int i = 0; i < words1.length; i++) {
            if (words1[i].equals(words2[i])) continue;
            if (!map.containsKey(words1[i])) return false;
            similar = false;
            dfs(words1[i], words2[i], new HashSet<>());
            if (!similar) return false;
            
        }
        
        return true;
    }
    private void dfs(String s, String t, HashSet<String> visited) {
        if (similar == true) return;
        if (map.get(s).contains(t)) {
            similar = true;
            return;
        }
        if (visited.contains(s)) return;
        visited.add(s);
        for(String a : map.get(s)) {
            dfs(a, t, visited);
        }
    }
}
