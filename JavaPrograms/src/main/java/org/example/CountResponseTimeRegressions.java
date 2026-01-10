package org.example;

import java.util.List;

public class CountResponseTimeRegressions {

    public static int countResponseTimeRegressions(List<Integer> responseTimes){
        if (responseTimes.size() <=1){
            return 0;
        }
        int count = 0 ;
        long sum = responseTimes.get(0);
        for (int i = 1; i <  responseTimes.size(); i++) {
            int current = responseTimes.get(i);

            if((long) current * i > sum){
                count++;
            }
            sum +=current;
        }
        return count;
    }
}
