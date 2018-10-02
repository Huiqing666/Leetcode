class Solution {
    public List<String> findStrobogrammatic(int n) {
        List<String> res = new ArrayList<>();
        if(n %2 == 1) {
            res.add("0");
            res.add("1");
            res.add("8");
        }
        return helper(res, n, 0);
    }
    private List<String> helper(List<String> res, int total, int current) {
        if(total/2 == current/2) return res;
        if(res.size() == 0) res.add("");
        List<String> res_new = new ArrayList<String>();
        for(String s : res) {
            res_new.add("1" + s + "1");
            res_new.add("6" + s + "9");
            res_new.add("8" + s + "8");
            res_new.add("9" + s + "6");
            if(total - current > 3) res_new.add("0" + s + "0");
            //res.remove(s);
        }
        
        return helper(res_new, total, current+2);
    }
}
