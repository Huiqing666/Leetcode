class Solution {
    public int lengthOfLastWord(String s) {
        int len = s.length();
        if(len == 0)return 0;
        int count = 0;
        int start = len - 1;
        for (int i = len - 1; i >= 0; i--){
            if(s.charAt(i) == ' ')start--;
            else break;
        }
        if(start < 0)return 0;
        for (int i = start; i >= 0; i--) {
            if(s.charAt(i) != ' '){
                count++;
            }else{
                return count;
            }
        }
        return count;
    }
}
