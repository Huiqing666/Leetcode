class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            int times = map.getOrDefault(t.charAt(i), 0);
            times++;
            map.put(t.charAt(i), times);
        }
        int left = 0;
        int minleft = 0;
        int minlen = s.length() + 1;
        int count = 0;
        char[] c = s.toCharArray();
        for (int right = 0; right < c.length; right++) {
            if (map.containsKey(c[right])) {
                map.put(c[right], map.get(c[right]) - 1);
                if (map.get(c[right]) >= 0) {
                    count++;
                }
                while (count == t.length()) {
                    if (right - left + 1 < minlen) {
                        minleft = left;
                        // System.out.println(minleft);
                        minlen = right - left + 1;
                    }
                    if (map.containsKey(c[left])) {
                        map.put(c[left], map.get(c[left]) + 1);
                        if (map.get(c[left]) > 0) {
                            count--;
                        }
                    }
                    left++;
                }
            }
        }
        if (minlen > s.length()) return "";
        return s.substring(minleft, minleft + minlen);
    }
}
