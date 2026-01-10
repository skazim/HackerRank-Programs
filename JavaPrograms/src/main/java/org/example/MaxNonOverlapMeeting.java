package org.example;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

//meetings = [[1, 2], [2, 3], [3, 4], [1, 3]]
// Explanation:
//
//Step 1: Sort meetings by end time → [[1,2],[2,3],[1,3],[3,4]].
//Step 2: Select [1,2] (count=1, last_end=2).
//Step 3: [2,3] has start 2 ≥ 2, select (count=2, last_end=3).
//Step 4: [1,3] start 1 < 3, skip.
//Step 5: [3,4] start 3 ≥ 3, select (count=3). Result = 3.
public class MaxNonOverlapMeeting {
    public static int maximizeNonOverlappingMeetings(List<List<Integer>> meetings) {

        int c = 0;
        if (meetings.isEmpty()){
            return 0;
        }
        meetings.sort(Comparator.comparing(a->a.get(1)));
        int lend = meetings.get(0).get(1);
        c=1;
        for (int i=1;i<meetings.size();i++){
            int lstr = meetings.get(i).get(0);
            if(lstr >= lend){
                c++;
                lend= meetings.get(i).get(1);
            }
        }
        return c;
    }
}
