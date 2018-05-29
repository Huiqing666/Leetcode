class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        if(n < 1) return 0;
        int[] res = new int[n];
        res[0] = 1;
        int[] p2 = new int[primes.length];
        int[] counter = new int[primes.length];
        
        for(int i = 0; i < primes.length; i++){
            p2[i] = primes[i];
        }
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++){
            for(int j = 0; j < primes.length; j++){
                min = Math.min(p2[j], min);
            }
            res[i] = min;
            for(int j = 0; j < primes.length; j++){
                if(min == p2[j]){
                    counter[j]++;
                    p2[j] = res[counter[j]] * primes[j];
                }
            }
            min = Integer.MAX_VALUE;
        
        }
        return res[n - 1];
        
    }
}
