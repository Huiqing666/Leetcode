class Solution {
    public String findContestMatch(int n) {
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = String.valueOf(i + 1);
        }
        while (n > 1) {
            String[] res = new String[n/2];
            for (int i = 0; i < n/2; i++) {
                res[i] = "(" + s[i] + "," + s[n - i - 1] + ")";
            }
            s = res;
            n = n >> 1;
            if (n == 1) return res[0];
        }

        return "";
    } 
}
