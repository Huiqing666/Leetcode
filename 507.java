class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num == 1) return false;
        int curr = 1;
        int i = 2;
        while (i < num && i < num / i ) {
            if (num % i == 0) {
                curr += i;
                curr += num / i;
                // System.out.println(i);
            }
            i++;
        }
        if (i == num / i && num % i == 0) curr += i;
        if (curr == num) return true;
        else return false;
        
    }
}
