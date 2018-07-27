class Solution {
    public int findNthDigit(int n) {
        int bit = 0;
        int minus = 9;
        if(n < 10) return n;
        while(n > 0){
            n -= minus * (bit + 1);
            
            minus *= 10;
            bit++;
            long a = n - (long) minus*(bit + 1);
            //System.out.println(a + "  " + minus + "  " + bit);
            if(a < 0) break;
            
        }
        
        long start = (long) Math.pow(10, bit);
        //System.out.println(start);
        int length = n / (bit + 1);
        n = n - length * (bit + 1);
        //System.out.println("length= " + length);
        String s = "";
        if(n == 0) {
            n = bit + 1;
            s = Long.toString(start + length - 1);
        }else {
            s = Long.toString(start + length);
        }
        System.out.println(s);
        return (s.charAt(n - 1) - '0');
    }
}
