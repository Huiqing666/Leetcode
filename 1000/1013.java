class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int total = 0;
        int[] bucket = new int[60];
        for (int i = 0; i < time.length; i++) {
            bucket[time[i] % 60]++;
        }
        for (int i = 1; i < 30; i++) {
            total += bucket[i] * bucket[60-i];
        }
        total += bucket[0] * (bucket[0] - 1)/2;
        total += bucket[30] * (bucket[30] - 1)/2;
        return total;
    }
}
