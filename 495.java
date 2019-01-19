class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 0 || duration <= 0) return 0;
        int last = (duration + timeSeries[0]);
        int dis = 0;
        for(int i = 1; i < timeSeries.length; i++) {
            if (last >= timeSeries[i]) {
                last = duration + timeSeries[i];
            }
            else {
                dis += timeSeries[i] - last;
                last = duration + timeSeries[i];
            }
            // System.out.println(last);
        }
        return last - timeSeries[0] - dis;
    }
}
