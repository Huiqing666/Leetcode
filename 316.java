class Solution {
    public String removeDuplicateLetters(String s) {
        // continuing remove the first smallest distinct char
        // recursive
        if (s.length() == 0) return "";
        int[] count = new int[26];
        int pos = 0;
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < s.charAt(pos)) {
                pos = i;
            }
            count[s.charAt(i) - 'a']--;
            if (count[s.charAt(i) - 'a'] == 0) break;
        }
        return s.substring(pos, pos + 1) + removeDuplicateLetters(s.substring(pos + 1).replaceAll("" + s.charAt(pos), ""));
    }
}
