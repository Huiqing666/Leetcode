class Solution {
    public int compress(char[] chars) {
        if(chars == null || chars.length == 0) return 0;
        char temp = chars[0];
        int count = 1;
        int index = 0;
        for(int i = 1; i < chars.length; i++){
            if(chars[i] == temp){
                count++;
            }else{
                String cc = Integer.toString(count);
                chars[index++] = temp;
                char[] array = cc.toCharArray();
                if(count != 1){
                    for(int j = 0; j < array.length; j++){
                        chars[index++] = array[j];
                    }
                }
                //after
                count = 1;
                temp = chars[i];
            }
        }
        String cc = Integer.toString(count);
        chars[index++] = temp;
        char[] array = cc.toCharArray();
        if(count != 1){
            for(int j = 0; j < array.length; j++){
                chars[index++] = array[j];
            }
        }
        return index;
        
    }
}
