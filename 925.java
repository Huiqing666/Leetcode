class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if (name.equals(typed)) return true; 
        int i = 0, j = 0;
        while (i < name.length() && j < typed.length()) {
            if (name.charAt(i) != typed.charAt(j)) {
                j++;
            }
            else {
                i++;
                j++;
            }
        }
        if (i != name.length() && j == typed.length()) return false;
        return true;
    }
}
