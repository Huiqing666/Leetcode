class Solution {
    String[] map = new String[26];
    Set<String> set = new HashSet<>();
    int[] count = new int[26];
    boolean res = false;
    public boolean wordPatternMatch(String pattern, String str) {
        dfs(pattern, 0, str, 0);
        // System.out.println(Arrays.toString(map));
        return res;
        
    }
    private void dfs(String p, int pi, String s, int si) {
        if (res) return;
        if (pi >= p.length() && si >= s.length()) res = true;
        if (pi >= p.length() || si >= s.length()) return;
        char c = p.charAt(pi);
        String m = map[c - 'a'];
        for (int i = si; i < s.length(); i++) {
            String substr = s.substring(si, i + 1);
            if (m != null) {
                if (!substr.equals(m)) continue;
                count[c - 'a']++;
            }
            else {
                if (set.contains(substr)) continue;
                set.add(substr);
                map[c - 'a'] = substr;
                count[c - 'a']++;
            }
            dfs(p, pi+1, s, i+1);
            count[c - 'a']--;
            if (count[c - 'a'] == 0) {
                map[c - 'a'] = null;
                set.remove(substr);
            }
            
            
        }
    }
}
