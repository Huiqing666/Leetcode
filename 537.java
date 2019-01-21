class Solution {
    public String complexNumberMultiply(String a, String b) {
        String[] l = a.split("\\+");
        String[] r = b.split("\\+");
        int a1 = Integer.valueOf(l[0]);
        int a2 = Integer.valueOf(l[1].substring(0, l[1].length() - 1));
        int b1 = Integer.valueOf(r[0]);
        int b2 = Integer.valueOf(r[1].substring(0, r[1].length() - 1));
        int c1 = a1 * b1 - a2 * b2;
        int c2 = a1 * b2 + a2 * b1;
        return c1 + "+" + c2 + "i";
    }
}
