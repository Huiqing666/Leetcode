class Solution {
    HashMap<String, List<String>> map = new HashMap<>();
    List<List<String>> res;
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        res = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for (String s : wordList) {
            set.add(s);
        }
        if (!set.contains(endWord)) return res;
        // set.remove(endWord);
        // set.remove(beginWord);
        Set<String> upper = new HashSet<>();
        Set<String> lower = new HashSet<>();
        upper.add(beginWord);
        lower.add(endWord);
        boolean topDown = true;
        boolean found = false;
        int len = beginWord.length();
        while (upper.size() != 0 && lower.size() != 0 && !found) {
            if (upper.size() > lower.size()) {
                Set<String> t = upper;
                upper = lower;
                lower = t;
                topDown = !topDown;
            }
            Set<String> temp = new HashSet<>();
            for (String s : upper) {
                set.remove(s);
            }
            for (String s : upper) {
                // set.remove(s);
                StringBuilder sb = new StringBuilder(s);
                // System.out.println(sb.toString());
                for (int i = 0; i < len; i++) {
                    char curr = sb.charAt(i);
                    for (int j  = 0; j < 26; j++) {
                        sb.setCharAt(i, (char)('a' + j));
                        if (set.contains(sb.toString())) {
                            String parent = s;
                            String child = sb.toString();
                            if (!topDown) {
                                String xx = parent;
                                parent = child;
                                child = xx;
                            }
                            List<String> tempList = map.getOrDefault(parent, new ArrayList<>());
                            tempList.add(child);
                            map.put(parent, tempList);
                            temp.add(sb.toString());
                            if (lower.contains(sb.toString())) found = true;

                        }
                    }
                    sb.setCharAt(i, curr); // set as original
                }
            }
            upper = temp;
            
        }
        if (found) dfs(beginWord, endWord, new ArrayList<>());
        return res;
        
    }
    private void dfs(String curr, String end, List<String> temp) {
        // System.out.println(curr);
        if (curr.equals(end)) {
            temp.add(end);
            res.add(new ArrayList<>(temp));
            return;
        }
        List<String> list = map.get(curr);
        
        temp.add(curr);
        if (list == null) return;
        for (int i = 0; i < list.size(); i++) {
            // temp.add(list.get(i));
            dfs(list.get(i), end, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
