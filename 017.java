class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> res = new LinkedList<String>();
        int len = digits.length();
        if(len == 0)return res;
        String[] str = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        res.add("");
        for(int i = 0; i < len; i++){
            int x = Character.getNumericValue(digits.charAt(i));
            while(res.peek().length() == i){
                String t = res.remove();
                for(char s : str[x].toCharArray()){
                    res.add(t+s);
                }
            }  
        }
        
        return res;
    }
}
