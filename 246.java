class Solution {
    public boolean isStrobogrammatic(String num) {
        HashSet<Character> set1 = new HashSet<>();
        set1.add('0');
        set1.add('1');
        set1.add('8');
        char[] c = num.toCharArray();
        for(int i = 0; i <= c.length/2; i++) {
            if(c[i] == '6') {
                System.out.println(c[i]);
                if(c[c.length - i - 1] != '9') return false;
            }else if(c[i] == '9') {
                if(c[c.length - i - 1] != '6') return false;
            }else if(set1.contains(c[i])){
                if(c[c.length - i - 1] != c[i]) return false;
            }else{
                return false;
            }
        }
        return true;  
    }
}
