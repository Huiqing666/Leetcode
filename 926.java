class Solution {
    public int minFlipsMonoIncr(String s) {
        int j = s.length() - 1;
        int[] dp1 = new int[s.length() + 1];
        int[] dp2 = new int[s.length() + 1];
        for (int i = 1; i <= s.length(); i++) {
            dp1[i] = dp1[i - 1] + (s.charAt(i - 1) == '0' ? 0 : 1);
                
            dp2[j] = dp2[j + 1] + (s.charAt(j) == '1' ? 0 : 1);
                // System.out.println(dp2[j] + " " + j)
            j--;
            
        }
        int res = s.length();
        for (int i = 0; i <= s.length(); i++) {
            res = Math.min(dp1[i] + dp2[i], res);
        }
        return res;
    }
}
