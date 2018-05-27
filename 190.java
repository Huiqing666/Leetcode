public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res += n & 1;
            n >>>= 1;   // CATCH: must do unsigned shift
            if (i < 31) // CATCH: for last digit, don't shift!
                res <<= 1;
         }
    return res;
        /*
        int[] a = new int[32];
        int res = 0;
        int i = 0;
        while(n > 0){
            a[i] = n % 2;
            n = n / 2;
            i++;
        }
        int x = 1;
        for(int j = 31; j >= 0; j--){
            res += x * a[j];
            x *= 2;

        }
        
        return res;
        */
    }
}
