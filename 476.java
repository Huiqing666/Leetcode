class Solution {
    public int findComplement(int num) {
        if(num == 1) return 0;
        int sum = 0;   
        int i = 1;
        while(num >= 2){
            sum = sum + (1-num%2)*i;
            num = num/2;
            i = i * 2;
        }
        return sum;
    }
}
