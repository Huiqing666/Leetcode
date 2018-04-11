class Solution {
    public boolean isHappy(int n) {
        Set<Integer> inLoop = new HashSet<Integer>();
        int sum = 0, x = 0;
        while (inLoop.add(n)) {
            sum = 0;
            while(n > 0){
                x = n % 10;
                sum += x * x;
                n /= 10;
            }
            if(sum == 1) return true;
            n = sum;
            
            
        }
        return false;
        
        
    }
}
