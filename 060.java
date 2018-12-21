class Solution {
    public String getPermutation(int n, int k) {
        int[] fact = new int[n+1];
        fact[0] = 1;
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
            fact[i] = sum;
            list.add(i);
        }
        StringBuilder sb = new StringBuilder();
        k = k - 1;
        for (int i = 1; i <= n; i++) {
            int index = k / fact[n - i];
            k = k % fact[n - i];
            sb.append(list.get(index));
            list.remove(list.get(index));
        }
        return sb.toString();
        
        
    }
}
