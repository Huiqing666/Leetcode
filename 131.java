class Solution {
    HashSet<String>p;
    List<List<String>> res;
    public List<List<String>> partition(String s) {
        p = new HashSet<>();
        res = new ArrayList<>();
        backtrack(s, s.length(), new ArrayList<>());
        return res;
        
    }
    private void backtrack(String s, int rem, List<String> temp) {
        if (rem == 0) {
            res.add(new ArrayList<>(temp));
        }
        for (int i = 1; i <= s.length(); i++) {
            String curr = s.substring(0, i);
            if (p.contains(curr) || isPalindrome(curr)) {
                p.add(curr);
                temp.add(curr);
                backtrack(s.substring(i), rem - i, temp);
                temp.remove(temp.size() - 1);
            }
        }
    } 
    private boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        }
        return true;
    }
}
