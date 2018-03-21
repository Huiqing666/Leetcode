class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if(len == 1) return strs[0];
        boolean curr = true;
        int j = 0;
        String res = "";
        if(len == 0)return res;
        while (curr) {
            for(int i = 1; i < len; i++){
                if(strs[i].length() <= j || strs[i-1].length() <= j ||strs[i].charAt(j) != strs[i-1].charAt(j)){
                    curr = false;
                    break;
                }

            }
            if(curr) res += Character.toString(strs[0].charAt(j));
            j++;
        }
        return res;

        
    }
}
