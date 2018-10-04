class Solution {
    public int reverse(int x) {
        
        int[] a= new int[11];
        int i;
        for(i = 0; i < 11; i++ ){
            a[i] = x%10 ;
            if(x >-10 && x < 10) break;
            else{
                x = x/10;
                //if(x < 0)a[++i] = -x;
                //else a[++i]= x;
                //break;
            }
        }
        long res = 0 ;
        int j;
        for(j = 0; j <= i; j++) {
            res = res*10 + a[j];
        if(res < Integer.MIN_VALUE||res > Integer.MAX_VALUE) return 0;}
        //if(x < 0) res = -res;
        return (int)res;
    }
}
