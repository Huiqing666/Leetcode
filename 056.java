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
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() < 2) return intervals;
        Collections.sort(intervals, new Comparator<Interval>(){
             public int compare(Interval i1, Interval i2){
                 return i1.start - i2.start;
             }
        });
        List<Interval> res = new ArrayList<>();
        for (int i = 0; i < intervals.size(); i++) {
            int start = intervals.get(i).start;
            int end = intervals.get(i).end;
            /*
            if(intervals.get(i).end < intervals.get(i + 1).start){
                Interval curr = new Interval(start, end);
                res.add(curr);
            }else{
                
            }
            */
            while(i < intervals.size() - 1 && end >= intervals.get(i + 1).start){
                i++;
                if(end < intervals.get(i).end) end = intervals.get(i).end;
            }
            Interval curr = new Interval(start, end);
                res.add(curr);
        }
        return res;
    }
}
