class Solution {
    public int mirrorReflection(int p, int q) {
        int np = p;
        while(np % q != 0) {
            np += p;
        }
        
        if(np/p % 2 == 0) {
            return 0;
        }
         
        if(np/q % 2 != 0) {
            return 1;
        }
        return 2;
    }
}
