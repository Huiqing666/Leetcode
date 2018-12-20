class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<Integer>();
        if (words.length == 0) return res;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            int times = map.getOrDefault(words[i], 0);
            times++;
            map.put(words[i], times);
        }
        int len = words[0].length();
        for (int i = 0; i <= s.length() - words.length*len; i++) {
            Map<String, Integer> copy = new HashMap<>(map);
            for (int j = 0; j < words.length; j++) {
                String curr = s.substring(i + j * len, i + j * len + len);
                // System.out.println(curr);
                if (copy.containsKey(curr)) {
                    // System.out.println(curr);
                    if (copy.get(curr) == 1) copy.remove(curr);
                    else copy.put(curr, copy.get(curr) - 1);
                }
                else {
                    break;
                }
            }
            if (copy.isEmpty()) {
                res.add(i);
                // i += len - 1;
            }
        }
        return res;
    }
}
