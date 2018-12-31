class Solution {
    ArrayList<Integer> list = new ArrayList<>();
    public int[] numsSameConsecDiff(int N, int K) {
        
        if (N == 1) {
            for (int i = 0; i <= 9; i++) {
                list.add(i);
            }
        }
        else {
            for (int i = 1; i <= 9; i++) {
                list.add(i);
            }
            helper(N - 1, K);
            
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
        
    }
    private void helper(int rem, int K) {
        if (rem == 0) return;
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int curr = list.get(i) % 10;
            if (K == 0) {
                temp.add(list.get(i) * 10 + curr);
                continue;
            }
            if (curr - K >= 0) {
                temp.add(list.get(i) * 10 + curr - K);
            }
            if (curr + K <= 9) {
                temp.add(list.get(i) * 10 + curr + K);
            }
            
        }
        list = new ArrayList<>(temp);
        helper(rem - 1, K);
    }
}
