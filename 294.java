class Solution {
    public boolean canWin(String s) {
        if(s == null && s.length() < 2) return false;
        for (int i = 0; i < s.length() - 1; i++) {
            StringBuilder sb = new StringBuilder(s);
            if(s.startsWith("++", i)){
                sb.replace(i, i+2, "--");
                if(!canWin(sb.toString())){
                return true;
            }
            }
            
        }
        return false;
        
    }
}
