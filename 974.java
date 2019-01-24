class Solution {
    public int subarraysDivByK(int[] A, int K) {
        HashMap<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);
        int count = 0;
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum = (sum + A[i]) % K;
            if (sum < 0) sum += K;
            count += preSum.getOrDefault(sum, 0);
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }
        
        
        return count;
    }
}
