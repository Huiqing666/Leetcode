class Solution {
    public int divide(int dividend, int divisor) {
        int sign = 1;
        if (dividend < 0 && divisor > 0 || (dividend > 0 && divisor < 0)) {
            sign = -1;
        }
        
        long dvd = Math.abs((long)dividend);
        long dvs = Math.abs((long)divisor);
        if (dvd < dvs) return 0;
        long ans = helper(dvd, dvs);
        
        if (ans > (long)Integer.MAX_VALUE) {
            if (sign == 1) return Integer.MAX_VALUE;
            else return Integer.MIN_VALUE;
        }
        else return (int)ans * sign;
        
    }
    private long helper(long dvd, long dvs) {
        //System.out.println(dvd);
        if (dvd < dvs) return 0;
        long multiple = 1;
        long sum = dvs;
        while ((sum + sum) < dvd) {
            sum += sum;
            multiple += multiple;
        }
        return multiple + helper(dvd - sum, dvs);
        
    }
}
