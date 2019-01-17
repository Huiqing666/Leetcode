class Solution {
    public int[][] kClosest(int[][] points, int K) {
        
        Arrays.sort(points, new Comparator<int[]>(){
            public int compare(int[] a, int[] b) {
                return a[0] * a[0] + a[1] * a[1] - b[0] * b[0] - b[1] * b[1];
            }
        });
        return Arrays.copyOfRange(points, 0, K);
        
    }
}
