class Solution {
    public boolean canPartitionKSubsets(int[] arr, int n) {
        if (n == 1) return true;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum % n != 0) return false;
        int subsum = sum / n;
        int[] subset = new int[n];
        dfs(arr, 0, subset, subsum);
        return can;

    }
    boolean can = false;
    private void dfs(int[] arr, int index, int[] sum, int subsum) {
        if (can) return;
        if (index == arr.length) {
            // System.out.println(Arrays.toString(sum));
            for (int i = 1; i < sum.length; i++) {
                if (sum[i] != sum[i - 1]) {
                    return;
                }
            }
            
            can = true;
            return;
        }
        for (int i = 0; i < sum.length; i++) {
            if (sum[i] + arr[index] > subsum){
                continue;
            }
            sum[i] += arr[index]; //
            
            dfs(arr, index + 1, sum, subsum);
            sum[i] -= arr[index];
        }

    }

}
