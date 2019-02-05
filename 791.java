class Solution {
    public String customSortString(String S, String T) {
        int[] count = new int[26];
        for (int i = 0; i < T.length(); i++) {
            count[T.charAt(i) - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            while(count[S.charAt(i) - 'a']-- > 0) {
                sb.append(S.charAt(i));
            }
        }
        for (int i = 0; i < 26; i++) {
            while(count[i]-- > 0) {
                sb.append((char)(i + (int)'a'));
            }
        }
        return sb.toString();
    }
}
