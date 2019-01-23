class Solution {
    public int repeatedStringMatch(String A, String B) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (sb.length() < B.length()) {
            sb.append(A);
            i++;
        }
        if (sb.toString().contains(B.subSequence(0, B.length()))) return i;
        sb.append(A);
        if (sb.toString().contains(B.subSequence(0, B.length()))) return i+1;
        return -1;
    }
}
