class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int K) {
        
        double[][] data = new double[quality.length][2];
        for(int i = 0; i < quality.length; i++){
            data[i][0] = (double)quality[i];
            data[i][1] = (double)wage[i]/quality[i];
        }
        Arrays.sort(data, (A, B) -> Double.compare(A[1], B[1]));
        //System.out.println(Arrays.toString(data[0]));
        PriorityQueue<Double> pq = new PriorityQueue<>(K, (A, B) -> Double.compare(B, A));
        
        double count = 0;
        for(int i = 0; i < K; i++) {
            pq.add(data[i][0]);
            count += data[i][0];
        }
        double result = data[K-1][1]*count;
        
        for(int i = K; i < quality.length; i++) {
            pq.add(data[i][0]);
            double max = pq.poll();
            count = count - max + data[i][0];
            result = Math.min(result, data[i][1]*count);
        }
        
        return result;
        
    }
}
