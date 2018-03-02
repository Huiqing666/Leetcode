class Solution {
    public String reverseString(String s) {
        int n = s.length();
        char a[] = s.toCharArray();
        char temp;
        for(int i = 0; i < (n/2); i++ ){
            temp = a[i];
            a[i] = a[n-i-1];
            a[n-i-1]=temp;
        }
        String res = String.valueOf(a);
        return res;
    }
}
