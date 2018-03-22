class Solution {
    public String convertToTitle(int n) {
        //String[] x = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W","X", "Y","Z"};
        StringBuilder res = new StringBuilder();
        while(n > 0){
            int i = (n - 1) % 26;
            n--;
            res.append((char)('A' + i));
            n = n / 26;
        }
        return res.reverse().toString();
    }
}
