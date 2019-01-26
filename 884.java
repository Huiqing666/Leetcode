class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        String[] w1 = A.split("\\s+");
        String[] w2 = B.split("\\s+");
        Set<String> f = new HashSet<>();
        Set<String> uf = new HashSet<>();
        for (int i = 0; i < w1.length; i++) {
            if (f.contains(w1[i])) continue;
            else {
                if (uf.contains(w1[i])) {
                    uf.remove(w1[i]);
                    f.add(w1[i]);
                }
                else {
                    uf.add(w1[i]);
                }
            }
        }
        // System.out.println(uf.size());
        for (int i = 0; i < w2.length; i++) {
            if (f.contains(w2[i])) continue;
            else {
                // System.out.println(w2[i]);
                if (uf.contains(w2[i])) {
                    uf.remove(w2[i]);
                    f.add(w2[i]);
                }
                else {
                    uf.add(w2[i]);
                }
            }
            
        }
        String[] res = new String[uf.size()];
        int index = 0;
        for (String s : uf) {
            res[index++] = s;
        }
        return res;
    }
}
