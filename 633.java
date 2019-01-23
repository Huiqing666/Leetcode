class Solution {
    public boolean judgeSquareSum(int c) {
        if ((int)Math.sqrt(c) * (int)Math.sqrt(c) == c) return true;
        int i = 1;
        while (i <= Math.sqrt(c)) {
            int r = c - i * i;
            // System.out.println(r);
            if ((int) Math.sqrt(r) * (int) Math.sqrt(r) == r) return true;
            i++;
        }
        return false;
    }
}
