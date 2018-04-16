class Solution {
    public String reverseVowels(String s) {
        if(s == null || s.length() == 0) return s;
        int i = 0, j = s.length()-1;
        String vowels = "aeiouAEIOU";
        char[] ss = s.toCharArray();
        while(i < j){
            while(i < j && !vowels.contains(ss[i]+"")){
                i++;
            }
            while(i < j && !vowels.contains(ss[j]+"")){
                j--;
            }
            char temp = ss[i];
            ss[i] = ss[j];
            ss[j] = temp;
            i++;
            j--;
        }
        return new String(ss);
        
    }
}
