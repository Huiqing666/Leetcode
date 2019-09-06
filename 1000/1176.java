class Solution {
    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        int start = 0;
        int points = 0;
        for (int i = 0; i < k && i < calories.length; i++) {
            start += calories[i];
        }
        if (start < lower) points--;
        if (start > upper) points++;
        if (k >= calories.length) {
            return points;
        }
        for (int i = k; i < calories.length; i++) {
            start -= calories[i - k];
            start += calories[i];
            if (start < lower) points--;
            if (start > upper) points++;
        }
        return points;
    }
}