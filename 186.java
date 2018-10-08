class Solution {
    public void reverseWords(char[] str) {
        if(str.length == 0) return;
        int start = 0;
        for(int i = 0; i < str.length; i++) {
            if(str[i] == ' '){
                reverse(str, start, i-1);
                start = i+1;
            }
            if(i == str.length-1) {
                reverse(str, start, i);
            }
            
        }
        
        reverse(str, 0, str.length-1);
        return;
        
        
    }
    public void reverse(char[] str, int start, int end) {
        for(int i = start; i <= (start+end)/2; i++) {
            char temp = str[i];
            //System.out.println(end+start-i);
            str[i] = str[end+start-i];
            str[end+start-i] = temp;
        }
    }
}
