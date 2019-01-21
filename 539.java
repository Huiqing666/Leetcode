class Solution {
    public int findMinDifference(List<String> points) {
        int[] bucket = new int[1440];
        for (int i = 0; i < points.size(); i++) {
            String[] s = points.get(i).split(":");
            bucket[Integer.valueOf(s[0]) * 60 + Integer.valueOf(s[1])]++;
        }
        int prev = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < bucket.length; i++) {
            if (bucket[i] > 0) {
                if (bucket[i] > 1) return 0;
                else {
                    if (i < prev) {
                        prev = i;
                    }
                    else {
                        min = Math.min(min, i - prev);
                        prev = i;
                    }
                }
            }
        }
        int l = 0, r = 1439;
        while (l < r) {
            if (bucket[l] == 0) l++;
            else break;
        }
        while (l < r) {
            if (bucket[r] == 0) r--;
            else break;
        }
        min = Math.min(min, l + 1440 - r);
        return min;
    }
}
