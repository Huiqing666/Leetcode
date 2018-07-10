class Solution {
    public boolean buddyStrings(String A, String B) {
        char[] AA = A.toCharArray();
        char[] BB = B.toCharArray();
        if(AA.length == 0 || BB.length == 0) return false;
        if(AA.length != BB.length) return false;
        int index1 = 0, index2 = 0;
        int count = 0;
        for(int i = 0; i < AA.length; i++) {
            if(AA[i] != BB[i]){
                if(count == 0) {
                    index1 = i;
                    count++;
                }else if(count == 1) {
                    index2 = i;
                    count++;
                }else{
                    return false;
                }
            }
        }
        if(AA[index1] != BB[index2] || AA[index2] != BB[index1]) return false;
        if(count == 0){
            Set<Character> s = new HashSet<Character>();
            for (char c : AA) s.add(c);
            return s.size() < AA.length;
        }
        return true;
        
        
    }
}
