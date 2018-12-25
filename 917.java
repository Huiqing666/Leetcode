class Solution {
    public String reverseOnlyLetters(String S) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) >= 'a' && S.charAt(i) <= 'z' || (S.charAt(i) >= 'A' && S.charAt(i) <= 'Z')) {
                sb.append(S.charAt(i));
            }
        }
        sb.reverse();
        
        for (int i = 0; i < S.length(); i++) {
            if ((S.charAt(i) < 'A' || S.charAt(i) > 'Z' && S.charAt(i) < 'a' || S.charAt(i) > 'z')) {
                sb.insert(i, S.charAt(i));
            }
        }
        return sb.toString();
        
    }
}
