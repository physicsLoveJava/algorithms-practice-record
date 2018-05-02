package leetcode.Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/my-calendar-i/description/
 */
public class MyCalendarI {

    public static class MyCalendar {

        List<int[]> event;
        public MyCalendar() {
            event = new ArrayList<int[]>();
            event.add(new int[]{-1, 0});
            event.add(new int[]{1000000000, 1000000000});
        }

        public boolean book(int start, int end) {

            int l = 0;
            int r = event.size()-1;
            while(l<r){
                int mid = (r-l)/2+l;
                if(event.get(mid)[0] == start){
                    return false;
                }else if(event.get(mid)[0]>start){
                    r = mid;
                }else{
                    l = mid+1;
                }
            }
            if(event.get(l-1)[1]<=start && event.get(l)[0]>=end){
                event.add(l, new int[]{start, end});
                return true;
            }
            return false;

        }

    }

}
