class Solution {
    public int hIndex(int[] citations) {
        if(citations == null || citations.length == 0) return 0;
        int n = citations.length;
        
        Arrays.sort(citations);
        int i = 0;
        for (int j = n -1; j >= 0 ; j--) {
            if(citations[j] > i) i++;
        }
        return i;
    }
}
