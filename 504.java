class Solution {
    public String convertToBase7(int num) {
        boolean flag = false;
        if(num < 0){
            flag = true;
            num = -num;
        }
        StringBuilder sb = new StringBuilder();
        while(num >= 7) {
            sb.append(num % 7);
            num = num / 7;
            //System.out.println(num);
            
        }
        sb.append(num);
        if(flag){
            sb.insert(sb.length(),'-');
        }
        return sb.reverse().toString();
    }
}
