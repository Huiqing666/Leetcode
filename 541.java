class Solution {
    public String reverseStr(String s, int k) {
        char[] c = s.toCharArray();
        int n = c.length / 2 / k;
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < s.length()) {
            if (i + k > s.length()) k = s.length() - i;
            StringBuilder temp = new StringBuilder(s.substring(i, i+k));
            sb.append(temp.reverse().toString());
            i = i + k;
            if (i > s.length()) break;
            else if (i + k > s.length()) {
                sb.append(s.substring(i));
                break;
            }
            else {
                sb.append(s.substring(i, i + k));
                i = i + k;
            }
        }
        return sb.toString();
    }
}
