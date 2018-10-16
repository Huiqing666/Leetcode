/* trick: let start point of each building be negative, then sort using one single rule
*/
class Solution {
    public List<int[]> getSkyline(int[][] buildings) {
        int len = buildings.length;
        int[][] points = new int[buildings.length*2][2];
        int i = 0;
        for(int[] building : buildings) {
            points[i][0] = building[0];
            points[i][1] = -building[2];
            points[i+1][0] = building[1];
            points[i+1][1] = building[2];
            i = i + 2;
        }
        Arrays.sort(points, (a, b) -> {
            if(a[0] != b[0]) {
                return a[0] - b[0];
            }else{
                return a[1] - b[1];
            }
        
        });
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        pq.offer(0);
        int preMax = 0;
        List<int[]> res = new ArrayList<>();
        for(int[] point : points) {
            if(point[1] < 0) {
                pq.offer(-point[1]);
            }else{
                pq.remove(point[1]);
            }
            int max = pq.peek();
            if(preMax != max) {
                res.add(new int[]{point[0], max});
                preMax = max;
            }
        }
        return res;
    }
}
