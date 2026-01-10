package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Integer> responseTimes = Arrays.asList(100, 200, 150,300);

        List<List<Integer>> intervals = new ArrayList<>();

        intervals.add(Arrays.asList(1,3));
        intervals.add(Arrays.asList(15,18));
        intervals.add(Arrays.asList(8,10));
        intervals.add(Arrays.asList(2,6));

//        System.out.println("Fibonacci " + Fabonacii.fabonacii(10));
//        System.out.println("CountResponseTimeRegressions " + CountResponseTimeRegressions.countResponseTimeRegressions(responseTimes));

        List<Integer> binarySearchArray = Arrays.asList(2,4,5,6,7,8,9,10);
        List<Integer> missingNumberArray = Arrays.asList(3, 4, -1, 1);
//        System.out.println("mergeAndSortIntervals " + mergeAndSortIntervals.mergeHighDefinitionIntervals(intervals));
//        System.out.print("binarySearchArray : " + BinarySearch.binarySearch(binarySearchArray,10));
        System.out.print(""+FindMissingNumber.findMissingNumber(missingNumberArray));
    }
}
