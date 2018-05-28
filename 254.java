class Solution {
    public List<List<Integer>> getFactors(int n) {
        List<Integer> factors = new ArrayList<Integer>();
        List<List<Integer>> res = new ArrayList<>();
        if(n <= 1) return res;
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0) factors.add(i);
        }
        helper(new ArrayList<Integer>(), res, 1, n, factors);
        return res;
    }
    private void helper(List<Integer> tempList, List<List<Integer>> res, int current, int n, List<Integer> factors){
        if(current == n){
            res.add(new ArrayList<Integer>(tempList));
        }
        if(current > n) return;
        for (int i = 0; i < factors.size(); i++) {
            if(tempList.size() >= 1 && tempList.get(tempList.size() - 1) > factors.get(i)) continue;
            tempList.add(factors.get(i));
            helper(tempList, res, current * factors.get(i), n, factors);
            tempList.remove(tempList.size() - 1);
        }
        
        
        
        
    }
}
