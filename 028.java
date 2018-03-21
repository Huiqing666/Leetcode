class Solution {
    public int strStr(String haystack, String needle) {
        int len = haystack.length();
        int len2 = needle.length();
        if (len2 == 0) return 0;
        if (len < len2) return -1;
        for (int i = 0; i < len; i++) {
            if(haystack.charAt(i) == needle.charAt(0)){
                if(i + len2 - 1 < len && haystack.substring(i, i + len2).equals(needle)) return i;
            }
        }
        return -1;
    }
}
