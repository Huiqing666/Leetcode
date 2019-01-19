class Solution {
    public int findSubstringInWraproundString(String p) {
        if (p.length() == 0) return 0;
        int sum = 0;
        int[] count = new int[26];
        int maxLen = 1;
        count[p.charAt(0) - 'a'] = 1;
        for (int i = 1; i < p.length(); i++) {
            if (p.charAt(i) - p.charAt(i - 1) == 1 || p.charAt(i - 1) - p.charAt(i) == 25) {
                maxLen++;
            }
            else {
                maxLen = 1;
            }
            count[p.charAt(i) - 'a'] = Math.max(count[p.charAt(i) - 'a'], maxLen);
        }
        for (int i = 0; i < 26; i++) {
            sum += count[i];
        }
        return sum;
        
    }
}
