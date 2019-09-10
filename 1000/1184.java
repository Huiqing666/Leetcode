class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int total = 0;
        int n = distance.length;
        for (int i = 0; i < n; i++) {
            total += distance[i];
        }
        if (destination < start) {
            destination += n;
        }
        int dis = 0;
        for (int i = start; i < destination; i++) {
            if (i >= n) {
                dis += distance[(i)%n];
                continue;
            }
            dis += distance[i]; 
        }
        return Math.min(dis, total - dis);
        
    }
}