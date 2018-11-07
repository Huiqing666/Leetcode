class Solution {
    public boolean isOneEditDistance(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        if (len1 == len2) {
            int count = 0;
            int i = 0, j = 0;
            
            while(i < len1) {
                if (c1[i++] != c2[j++]) count++;
            }
            if (count != 1) return false;
            else return true;
        }
        else if (len1 + 1 == len2) {
            int i = 0, j = 0;
            while (i < len1) {
                if(c1[i++] != c2[j++]) i--;
                if (j - i > 1) return false;
            }
            return true;
            
        }
        else if (len2 + 1 == len1) {
            int i = 0, j = 0;
            while (i < len2) {
                if(c2[i++] != c1[j++]) i--;
                if (j - i > 1) return false;
            }
            return true;
            
        }
        else return false;
        
        
    }
}
