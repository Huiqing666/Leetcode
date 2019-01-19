class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        Set<String> pre = new HashSet<>();
        List<String> res = new ArrayList<>();
        Arrays.sort(words, (a, b) -> (a.length() - b.length()));
        for (int i = 0; i < words.length; i++) {
            if (canForm(words[i], pre)) {
                res.add(words[i]);
            }
            pre.add(words[i]);
        }
        return res;
        
    }
    private boolean canForm(String s, Set<String> set) {
        if (set.isEmpty()) return false;
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (!dp[j]) continue;
                if (set.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
