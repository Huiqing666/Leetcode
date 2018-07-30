class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int len = bits.length;
        int ones = 0;
        if(len < 2) return true;
        for(int i = len - 2; i >= 0; i--) {
            if(bits[i] == 1) ones++;
            else break;
        }
        if(ones % 2 == 1) return false;
        return true;
    }
}
