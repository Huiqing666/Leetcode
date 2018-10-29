class Solution {
    public int nextGreaterElement(int n) {
        char[] c = (n + "").toCharArray();
        
        int i = 0, j = 0;
        for (i = c.length - 1; i > 0; i--) {
            if (c[i] > c[i-1]) {
                break;
            }
        }
        if(i == 0) return -1;
        
        int smallest = i - 1, x = i;
        for(j = i; j < c.length; j++) {
            if (c[j] > c[smallest] && c[j] < c[x]) {
                x = j;
            }
        }
        char temp = c[i-1];
        //System.out.println(c[x]);
        c[i-1] = c[x];
        c[x] = temp;
        
        
        Arrays.sort(c, i, c.length);
        
        long val = Long.parseLong(String.valueOf(c));
        
        return val > Integer.MAX_VALUE ? -1: (int) val;
    }
}
