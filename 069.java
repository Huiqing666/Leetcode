class Solution {
    public int mySqrt(int x) {
        
        float res = (float)x;
        float last = 0;
        while(Math.abs(last - res) > 0.5){
            last = res;
            res = (x/res + res)/2;
        }
        if((int)res * (int)res > x)  
            res = res - 1; 
        return (int)res;
    }
}
