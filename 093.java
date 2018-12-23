class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        helper(0, "", res, s);
        return res;
        
    }
    private void helper(int index, String temp, List<String> res, String s) {
        if (index == 3) {
            if (s.length() > 0 && s.length() < 4 && Integer.valueOf(s) < 256) {
                if (Integer.valueOf(s) > 0 && s.charAt(0) == '0') return;
                if (Integer.valueOf(s) == 0 && s.length() > 1) return;
                temp = temp + s;
                res.add(temp);
            }
            else {
                return;
            }
        }
        for (int i = 1; i <= 3; i++) {
            if (i <= s.length()){
                String sub = s.substring(0, i);
                if (Integer.valueOf(sub) < 256) {
                    if (Integer.valueOf(sub) > 0 && sub.charAt(0) == '0') return;
                    if (Integer.valueOf(sub) == 0 && sub.length() > 1) return;
                    String newtemp = temp + sub + '.';
                    helper(index + 1, newtemp, res, s.substring(i));
                }
            }
        }
        
    }
}
