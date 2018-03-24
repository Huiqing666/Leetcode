class Solution {
    public String addBinary(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();
        int max = Math.max(len1, len2);
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < max; i++) {
            int m = i < len1 ? a.charAt(len1 - i - 1) - '0' : 0;
            int n = i < len2 ? b.charAt(len2 - i - 1) - '0' : 0;
            sb.append((m + n + carry) % 2);
            carry = (m + n + carry)/2;
        }
        if (carry == 1) sb.append(carry);
        return sb.reverse().toString();
    }
}
