class Solution {
    public int compareVersion(String v1, String v2) {
        String[] i1 = v1.split("\\.");
        String[] i2 = v2.split("\\.");
        String[] temp = i1;
        boolean swap = false;
        if (i2.length > i1.length) {
            swap = true;
            i1 = i2;
            i2 = temp;
        }
        for (int i = 0; i < i2.length; i++) {
            
            if(Integer.valueOf(i1[i]) > Integer.valueOf(i2[i])) {
                if (swap) return -1;
                return 1;
            }
            else if(Integer.valueOf(i1[i]) < Integer.valueOf(i2[i])) {
                if (swap) return 1;
                return -1;
            }
            
        }
        if (i1.length == i2.length) return 0;
        for (int j = i2.length; j < i1.length; j++) {
            if (Integer.valueOf(i1[j]) == 0) continue;
            else if (swap) return -1;
            else return 1;
        }
        return 0;
    }
}
