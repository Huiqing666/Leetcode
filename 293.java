class Solution {
    public List<String> generatePossibleNextMoves(String s) {
        int len = s.length();
        List<String> res = new ArrayList<String>();
        StringBuilder sb = new StringBuilder(s);
        if(len < 2) return res;
        for (int i = 0; i < len-1; i++) {
            if(s.charAt(i) == '+' && s.charAt(i+1) == '+'){
                sb.replace(i, i + 2,"--");
                res.add(sb.toString());
                sb = new StringBuilder(s);  
            }
        }
        return res;
    }
}
