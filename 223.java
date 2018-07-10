class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int overlap = 0;
        if(C <= E || A >= G || B >= H || D <= F) overlap = 0;//column
        else{
            int[] x = new int[4];
            x[0] = A;
            x[1] = C;
            x[2] = E; 
            x[3] = G;
            int[] y = new int[4];
            y[0] = B;
            y[1] = D;
            y[2] = F;
            y[3] = H;
            Arrays.sort(x);
            Arrays.sort(y);
            //System.out.println(Arrays.toString(x));
            //System.out.println(Arrays.toString(y));
            overlap = (x[2] - x[1]) * (y[2] - y[1]);
        }
        return (D-B)*(C-A)-overlap+(H-F)*(G-E);
    }
}
