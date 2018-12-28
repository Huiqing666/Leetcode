class Solution {
    public int candy(int[] ratings) {
        int[] all = new int[ratings.length];
        Arrays.fill(all, 1);
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i-1]) {
                all[i] = all[i-1] + 1;
            }
        }
        for (int i = ratings.length - 1; i > 0; i--) {
            if (ratings[i] < ratings[i-1]) {
                all[i-1] = Math.max(all[i-1], all[i] + 1);
            }
        }
        int sum = 0;
        for (int i : all) {
            sum += i;
        }
        return sum;
    }
}
