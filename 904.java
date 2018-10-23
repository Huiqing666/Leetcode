class Solution {
    public int totalFruit(int[] c) {
        if(c.length == 0) return 0;
        int start1 = 0;
        int end1 = -1;
        int max = 0;
        int i = 1;
        for(; i < c.length; i++) {
            if(c[i] == c[i-1]) {
                continue;
            }else{
                if(end1 == -1) {
                    end1 = i-1;
                    continue;
                }
                if(c[i] != c[end1]) {
                    max = Math.max(max, i - start1);
                    start1 = end1 + 1;
                    end1 = i-1;
                    
                }
                else{
                    end1 = i-1; //swap 1 and 2
                }
            }
            
        }
        return Math.max(max, i - start1);
    }
}
