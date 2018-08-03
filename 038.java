class Solution {
    public String countAndSay(int n) {
        StringBuilder sb = new StringBuilder();
        String pre = "1";
        
        while(n > 1) {
            int i = 0;
            char temp = pre.charAt(0);
            int count = 0;
            for(; i < pre.length(); i++) {
                if(pre.charAt(i) == temp){
                    count++;
                }else{
                    sb.append(count);
                    sb.append(pre.charAt(i - 1));
                    temp = pre.charAt(i);
                    count = 1;
                }
            }
            sb.append(count);
            sb.append(pre.charAt(i - 1));
            n--;
            pre = sb.toString();
            sb = new StringBuilder();
        }
        return pre;    
    }
    
}
