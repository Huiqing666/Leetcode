class Solution {
    Set<String> set;
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        set = new HashSet<>();
        for (String s : wordList) {
            set.add(s);
        }
        if (!set.contains(endWord)) return 0;
        Set<String> upper = new HashSet<>();
        Set<String> lower = new HashSet<>();
        upper.add(beginWord);
        lower.add(endWord);
        int count = 2;
        int len = beginWord.length();
        while (upper.size() != 0 && lower.size() != 0) {
            if (upper.size() > lower.size()) {
                Set<String> t = upper;
                upper = lower;
                lower = t;
            }
            Set<String> temp = new HashSet<>();
            for (String s : upper) {
                
                StringBuilder sb = new StringBuilder(s);
                System.out.println(sb.toString());
                for (int i = 0; i < len; i++) {
                    char curr = sb.charAt(i);
                    for (int j  = 0; j < 26; j++) {
                        sb.setCharAt(i, (char)('a' + j));
                        if (lower.contains(sb.toString())) return count;
                        if (set.contains(sb.toString())) {
                            temp.add(sb.toString());
                            set.remove(sb.toString());
                        }
                    }
                    sb.setCharAt(i, curr); // set as original
                }
            }
            upper = temp;
            count++;
        }
        
        
        return 0;
    }
}
