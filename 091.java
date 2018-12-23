class Solution {
    public int numDecodings(String s) {
        if (s.length() == 0 || s.charAt(0) == '0') return 0;
        int[] ways = new int[s.length() + 1];
        char[] c = s.toCharArray();
        ways[0] = 1;
        ways[1] = 1;
        for (int i = 1; i < c.length; i++) {
            int tens = (int) (c[i-1] - '0');
            // System.out.println(tens);
            int ones = (int) (c[i] - '0');
            if (c[i] == '0') {
                if (c[i-1] == '0' || c[i-1] > '2') return 0;
                ways[i+1] = ways[i-1];
                continue;
            }
            if (tens != 0 && tens * 10 + ones <= 26) {
                ways[i+1] = ways[i] + ways[i-1];
            }
            else {
                ways[i+1] = ways[i];
            }
        }
        // System.out.println(Arrays.toString(ways));
        return ways[s.length()];
    }
}
