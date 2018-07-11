class Solution {
    public String toGoatLatin(String S) {
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        String[] words = S.split("\\s+");
        StringBuilder[] sb = new StringBuilder[words.length];
        String as = "a";
        for(int i = 0; i < words.length; i++) {
            sb[i] = new StringBuilder(words[i]);
            //starting with a vowel
            if(!vowels.contains(Character.toLowerCase(words[i].charAt(0)))){
                sb[i].deleteCharAt(0);
                sb[i].append(words[i].charAt(0));
            }
            sb[i].append("ma");
            sb[i].append(as);
            sb[i].append(" ");
            as += "a";
        }
        sb[words.length -1].deleteCharAt(sb[words.length-1].length() -1);
        String res = "";
        for(StringBuilder word : sb){
            res += word.toString();
        }
        
        return res;
    }
}
