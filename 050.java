class Solution {
    public double myPow(double x, int n) {
        long absn = Math.abs((long)n);
        double res = 1;
        double temp = x;
        while(absn > 0){
            if(absn%2 == 1){
                res = res * temp;
            }
            absn = absn/2;
            temp = temp * temp;
        }
        if(n < 0)return 1/res;
        return res;
    }
}
