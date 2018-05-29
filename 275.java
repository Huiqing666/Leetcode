class Solution {
    public int hIndex(int[] citations) {
        if(citations == null || citations.length == 0) return 0;
        int n = citations.length;
        
        //Arrays.sort(citations);
        int i = 0;
        for (int j = n -1; j >= 0 ; j--) {
            if(citations[j] > i) i++;
        }
        return i;
        
    }
}
/////////////////////////////
//binary:
class Solution {
    public int hIndex(int[] citations) {
        if(citations == null || citations.length == 0) return 0;
        int n = citations.length;
        
        //Arrays.sort(citations);
        int lo = 0;
        int hi = n - 1;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            if(citations[mid] == n - mid) return n - mid;
            else if(citations[mid] > n - mid) {
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }
        return n - lo;
        
    }
}
