class Solution {
    public int numFriendRequests(int[] ages) {
        int total = 0;
        int[] count = new int[121];
        int[] countTotal = new int[121];
        for (int age : ages) {
            count[age]++;
        }
        for (int i = 0; i < 120; i++) {
            countTotal[i+1] = count[i + 1] + countTotal[i];
        }
        for (int i = 15; i <= 120; i++) {
            if(count[i] == 0) continue;
            int countInRange = countTotal[i] - countTotal[i / 2 + 7];
            total += countInRange * count[i] - count[i];
        }
        return total;
        
    }
}
