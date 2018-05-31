class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int length = word.length();
        int i = 0,j = 0;
        for(; i < length;){
            if(j >= abbr.length()) return false;
            if((abbr.charAt(j) - '0') > 0 && (abbr.charAt(j) - '0') <= 9){
                int ii = i;
                int sum = 0;
                while(j < abbr.length() && (abbr.charAt(j) - '0') >= 0 && (abbr.charAt(j) - '0') <= 9) {
                    sum = sum * 10 + (abbr.charAt(j) - '0');
                    j++;
                }
                i = ii + sum;
                if(i > length) return false;
                //j++;
            }
            
            else if(word.charAt(i) == abbr.charAt(j)) {
                i++;
                j++;
            }
            else return false;
        }
        return j == abbr.length() ? true : false;
        
    }
}
