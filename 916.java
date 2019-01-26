class Solution {
    public List<String> wordSubsets(String[] A, String[] B) {
        int[] Bmax = new int[26];
        for (String s : B) {
            int[] temp = count(s);
            for (int i = 0; i < 26; i++) {
                Bmax[i] = Math.max(Bmax[i], temp[i]);
            }
        }
        List<String> res = new ArrayList<>();
        for (String s : A) {
            int[] temp = count(s);
            int i = 0;
            for (; i < 26; i++) {
                if (temp[i] < Bmax[i]) break;
            }
            if (i == 26) res.add(s);
            
        }
        return res;
    }
    
    private int[] count(String s) {
        int[] res = new int[26];
        for (int i = 0; i < s.length(); i++) {
            res[s.charAt(i) - 'a']++;
        }
        return res;
    }
}
