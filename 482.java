class Solution {
    public String licenseKeyFormatting(String S, int K) {
        char[] c = S.toCharArray();
        int curr = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = c.length - 1; i >= 0; i--) {
            if(c[i] == '-') {
                continue;
            }
            if (c[i] >= 'a' && c[i] <= 'z') {
                c[i] = (char) (c[i] - 32);
            }
            sb.append(c[i]);
            curr++;
            if (curr == K) {
                sb.append('-');
                curr = 0;
            }
        }
        if (sb.length() == 0) return "";
        sb.reverse();
        while (sb.charAt(0) == '-') {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}
