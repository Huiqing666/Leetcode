class Solution {
    public boolean backspaceCompare(String S, String T) {
        StringBuilder ss = new StringBuilder();
        StringBuilder tt = new StringBuilder();
        for(char i : S.toCharArray()){
            if(i == '#'){
                if(ss.length() == 0) continue;
                ss.deleteCharAt(ss.length() - 1);
            }else{
                ss.append(i);
            }
        }
        for(char j : T.toCharArray()){
            if(j == '#'){
                if(tt.length() == 0) continue;
                tt.deleteCharAt(tt.length() - 1);
            }else{
                tt.append(j);
            }
        }
        return ss.toString().equals(tt.toString());
    }
}
