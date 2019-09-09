class Solution {
    public int countLetters(String S) {
        int total = 0;
        char[] c = S.toCharArray();
        char pre = ' ';
        int curr = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == pre) {
                curr++;
            }
            else {
                pre = c[i];
                total += (int) curr * (curr + 1) / 2;
                curr = 1;
            }
        }
        total += (int) curr * (curr + 1) / 2;
        return total;
    }
}