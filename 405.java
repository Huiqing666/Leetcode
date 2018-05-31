class Solution {
    public String toHex(int num) {
        StringBuilder res = new StringBuilder();
        if(num == 0) return "0";
        String[] hex = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
        //if(num > 0){
            while(num != 0){
                //System.out.println(num);
                String tmp = hex[num & 15];
                res.append(tmp);
                num >>>= 4;
            }
            return res.reverse().toString();
        //}
        /*
        //num < 0
        int[] binary = new int[32];
        //num = -num;
        int j = 0;
        while(num < 0){
            System.out.println(num);
            binary[31 - j] = num %2;
            num = num 
            j++;
        }
        boolean flag = true;
        for(int i = 0; i < 32; i += 4){
            int temp = binary[i] * 8 + binary[i+1] * 4 + binary[i+2] * 2 + binary[i+3];
            if(temp != 0) flag = false;
            if(temp != 0 || flag == false)res.append(hex[temp]);
        }
        return res.toString();
        */
    }
}
