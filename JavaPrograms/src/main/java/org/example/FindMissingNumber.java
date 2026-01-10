package org.example;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindMissingNumber {
    public static int findMissingNumber(List<Integer> orderNumbers) {
        Set<Integer> orderNumbersCopy = orderNumbers.stream().filter(n -> n > 0).collect(Collectors.toSet());
        int missing = 1;
        while ((orderNumbersCopy.contains(missing))) {
            missing++;
        }
        return missing;
    }
}
