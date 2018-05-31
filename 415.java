class Solution {
    public String addStrings(String num1, String num2) {
        int sum1 = 0, sum2 = 0;
        int len1 = num1.length(), len2 = num2.length();
        if(len1 == 0) return num2;
        if(len2 == 0) return num1;
        StringBuilder sb = new StringBuilder();
        int i = len1 - 1, j = len2 -1;
        int x = 0;
        while(i >= 0 || j >= 0){
            int temp = 0;
            if(i >=0 && j >= 0){
                temp = x + (num1.charAt(i) -'0') + (num2.charAt(j) - '0');
                i--;
                j--;
            }else if(i < 0 && j < 0) break;
            else if(i < 0){
                temp = x + (num2.charAt(j) - '0');
                j--;
            }
            else{
                temp = x + (num1.charAt(i) - '0');
                i--;
            }
            if(temp > 9) {
                temp = temp - 10;
                x = 1;
            }else{
                x = 0;
            }
            sb.append(temp); 
        }
        if(x != 0)sb.append(1);
        return sb.reverse().toString();
        
    }
}
