package array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MergeIntervals {

    private final ArrayList<Interval> intervals;

    MergeIntervals(int intervalSize){
        this.intervals = new ArrayList<>(intervalSize);
    }
    public static class Interval {
        int start;
        int end;
        public Interval(int s, int e){
            this.start = s;
            this.end = e;
        }
    }

    //O(N log N) : O(1)
    public void merge() {
        intervals.sort(new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });

        for (int i = 1, j = 0; i < intervals.size() ; i++) {
            if(intervals.get(j).end >= intervals.get(i).start){
                intervals.get(j).end = Math.max(intervals.get(j).end, intervals.get(i).start);
                intervals.remove(i);
            }
        }

        for(Interval i: intervals){
            System.out.println(i.start+" "+i.end);
        }
    }

    public void createInterval(int s, int e){
        intervals.add(new Interval(s, e));
    }

}
