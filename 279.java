class Solution {
    public int numSquares(int n) {
        /*
        int x = (int) Math.sqrt(n);
        if(x * x == n)return 1;
        int min = Integer.MAX_VALUE;
        for(int i = 1; i <= x; i++){
            min = Math.min(min, numSquares(i*i) + numSquares(n - i*i));
        }
        return min;
        */
        int[] minimal = new int[n+1];
        
        Arrays.fill(minimal,Integer.MAX_VALUE);
        minimal[0] = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j * j <= i; j++){
                minimal[i] = Math.min(minimal[i], minimal[i - j*j] + 1);
                //System.out.println(Arrays.toString(minimal));
            }
        }
        return minimal[n];
    }
}
