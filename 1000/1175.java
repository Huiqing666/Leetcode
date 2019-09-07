class Solution {
    public int numPrimeArrangements(int n) {
        boolean[] prime = new boolean[n + 1];
        int MOD = (int) (1e9 + 7), cnt = 0;
        Arrays.fill(prime, 2, n + 1, true);
        for (int i = 2; i * i <= n; i++)
            if (prime[i])
                for (int j = i * i; j <= n; j += i)
                    prime[j] = false;

        for (int i = 0; i < prime.length; i++)
            if (prime[i])
               cnt++;
        long ret = 1;
        for (int i=2; i <= cnt; i++)  ret = (ret * i) % MOD;
        for (int i=2; i <= n - cnt; i++) ret = (ret * i) % MOD;
        
        return (int) ret;
        
    }
}