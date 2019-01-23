class Solution {
    public int smallestFactorization(int a) {
        if (a < 10) return a;
        StringBuilder sb = new StringBuilder();
        while (a >= 10) {
            int i = 9;
            for (; i > 1; i--) {
                if (a % i == 0) {
                    sb.append(i);
                    a = a / i;
                    break;
                }
            }
            if (i == 1) return 0;
        }
        if (a != 1) sb.append(a);
        if (Long.valueOf(sb.reverse().toString()) > (long) Integer.MAX_VALUE) return 0;
        return Integer.valueOf(sb.toString());
    }
}
