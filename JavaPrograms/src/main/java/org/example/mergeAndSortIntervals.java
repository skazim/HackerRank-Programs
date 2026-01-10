package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class mergeAndSortIntervals {
    public static List<List<Integer>> mergeHighDefinitionIntervals(List<List<Integer>> intervals){

        List<List<Integer>> result = new ArrayList<>();
        if (intervals == null || intervals.size() == 0){
            return result;
        }
        int start = intervals.get(0).get(0);
        int end = intervals.get(0).get(1);
        intervals.sort(Comparator.comparing(a ->a.get(0)));

        for (int i = 1; i < intervals.size(); i++) {
            int currentStart = intervals.get(i).get(0);
            int currentEnd = intervals.get(i).get(1);

            if (currentStart <= end) end = Math.max(end, currentEnd);
            else{
                result.add(Arrays.asList(start, end));
                start = currentStart;
                end = currentEnd;
            }
        }
        result.add(Arrays.asList(start,end));
        return result;
    }
}
