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
    public List<Interval> insert(List<Interval> intervals, Interval v2) {
        List<Interval> list = new ArrayList<Interval>();
        int i = 0;
        int start = v2.start;
        int end = v2.end;
        for(; i < intervals.size(); i++) {
            Interval v1 = intervals.get(i);
            if(end < v1.start) {
                list.add(new Interval(start, end));
                list.add(v1);
                break;
            }
            if(v1.end >= end) {
                list.add(new Interval(Math.min(v1.start, start), v1.end));
                break;
            }
            if(v1.end < start) {
                list.add(v1);
            }else if(v1.start < start) {
                start = v1.start;
                //System.out.println(start);
            }
        }
        if(i == intervals.size()) {
            if(intervals.size() == 0 || intervals.get(intervals.size() - 1).end != end) {
                list.add(new Interval(start, end));
            }
        }
        for(int j = i+1; j < intervals.size();j++) {
            list.add(intervals.get(j));
        }
        
        return list;     
    }
}
