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
    public int minMeetingRooms(Interval[] intervals) {
        int rooms = 0;
        int[] starts = new int[intervals.length];
        int[] ends = new int[intervals.length];
        for(int i = 0; i < starts.length; i++){
            starts[i] = intervals[i].start;
            ends[i] = intervals[i].end;
        }
        Arrays.sort(starts);
        Arrays.sort(ends);
        int index = 0;
        for(int i = 0; i < starts.length; i++){
            //System.out.println(starts[i]);
            //System.out.println(ends[index]);
            if(starts[i] < ends[index]){
                rooms++;
            }else{
                index++;
            }
        }
        return rooms;
    }
}
