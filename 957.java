class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
        N = N % 14;
        if (N == 0) N = 14;
        for (int j = 0; j < N; j++) {
            int[] res = new int[cells.length];
            for (int i = 1; i < cells.length - 1; i++) {
                if ((cells[i-1] == 1 && cells[i+1] == 1) 
                    || (cells[i-1] == 0 && cells[i+1] == 0)) {
                    res[i] = 1;
                    
                }
                else {
                    res[i] = 0;
                }
            }
            cells = res;
            //System.out.println(Arrays.toString(cells));
        }
        return cells;
        
    }
}
