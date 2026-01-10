package org.example;

import java.util.List;

public class BinarySearch {

    public static int binarySearch(List<Integer> nums , int target){

        int left= 0; int right = nums.size() -1;
        while (left <= right){
            int mid = left + ((right - left)/2);
            if (nums.get(mid) == target){
                return mid;
            } else if (nums.get(mid) < target) {
                left = mid + 1 ;
            } else {
                right = mid - 1;
            }
        }
        return -1;
//        return nums.contains(target)?nums.indexOf(target):-1;
    }
}
