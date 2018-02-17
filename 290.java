class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split("\\s+");
        int len = words.length;
        if(len != pattern.length())return false;
        for(int i = 1; i < len; i++){
            //System.out.print(words[i]);
            for(int j = 0; j < i; j++){
                if(pattern.charAt(i) == pattern.charAt(j)){
                    //System.out.print(words[i]);
                    //System.out.print(words[j]);
                    //System.out.print("*************");
                    if(words[i].equals(words[j]))continue;
                    else return false;
                }else{
                    if(words[i].equals(words[j]))return false;
                }
            }
        }
        return true;
    }
}
