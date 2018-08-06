public class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        if(words.length == 0) return "";
        //System.out.println(words.length);
        for(int i = 0; i < words.length / 2; i++) {
            String temp = words[i];
            words[i] = words[words.length - i - 1];
            words[words.length - i - 1] = temp;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < words.length - 1; i++){
            sb.append(words[i]);
            //System.out.println(words[i]);
            sb.append(' ');
        }
        sb.append(words[words.length - 1]);
        return sb.toString().trim();
        
    }
}
