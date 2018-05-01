class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        s=new String(a);
        //System.out.println(s);
        t=new String(b);
        //System.out.println(t);
        if(s.equals(t))return true;
        return false;
        
    }
}
