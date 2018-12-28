class Solution {
    public String shortestPalindrome(String s) {
        char[] c = s.toCharArray();
        int n = 0;
        for (int i = c.length / 2; i > 0; i--) {
            // System.out.println(i);
            
            int j = 1;  
            while (j <= i && i + j < c.length && c[i + j] == c[i - j]) {
                j++;
            }
            if (j > i) {
                // System.out.println(i);
                n = c.length - i * 2 - 1;
                return perform(s, n);
            }
            j = 0; 
            while (j < i && c[i + j] == c[i - 1 - j]) {
                j++;
            }
            if (j == i) {
                System.out.println(i);
                n = c.length - i * 2;
                return perform(s, n);
            }
        }
        return perform(s, c.length - 1);
    }
    private String perform(String s, int append) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < append; i++) {
            sb.append(s.charAt(s.length() - i - 1));
        }
        sb.append(s);
        return sb.toString();
    }
    
}
