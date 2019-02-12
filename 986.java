/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public Interval[] intervalIntersection(Interval[] A, Interval[] B) {
        if (A.length == 0 || B.length == 0) return new Interval[0];
        List<Interval> list = new ArrayList<>();
        int j = 0;
        int start = 0;
        int end  = 0;
        for (int i = 0; i < A.length; i++) {
            
            start = Math.max(A[i].start, B[j].start);
            end = Math.min(A[i].end, B[j].end);
            if (start <= end) {
                list.add(new Interval(start, end));
            }
            if (A[i].end > B[j].end) {
                j++;
                if (j >= B.length) break;
                if (A[i].end >= B[j].start) {
                    i--;
                }
            }

            // System.out.println(i);

        }
        
        Interval[] res = new Interval[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
