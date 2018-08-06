class Solution {
    public List<String> letterCasePermutation(String S) {
        String lower = S.toLowerCase();
        List<String> res = new ArrayList<String>();
        res.add(lower);
        for(int i = 0; i < S.length(); i++) {
            while(i < S.length() && lower.charAt(i) - '9' <= 0){
                i++;
            }
            if(i >= S.length()) break;
            int size = res.size();
            for(int k = 0; k < size; k++) {
                char[] c = res.get(k).toCharArray();
                c[i] ^= (1 << 5);
                res.add(String.valueOf(c));
            }
        }
        return res;
        
    }
}
