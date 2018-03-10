class Solution {
    public String multiply(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        int[] res = new int[len1 + len2];
        String result = "";
        for(int i = len2 - 1; i >= 0; i--){
            for(int j = len1 - 1; j >= 0; j--){
                res[i + j + 1] = res[i + j + 1] + (num2.charAt(i) - '0') * (num1.charAt(j) - '0');
                if(res[i + j + 1] >= 10){
                    res[i + j] = res[i + j] + res[i + j + 1] / 10;
                    res[i + j + 1] = res[i + j + 1] % 10;
                }
            }
        }
        int i;
        for(i = 0; i < len1 + len2; i++){
            if(res[i] != 0) break;
        }
        for( i = i; i < len1 + len2; i++){
            System.out.println(res[i]);
            result = result + Integer.toString(res[i]);
        }
        if(result == "")return "0";
        return result;
        
    }
}
