package org.example;

import java.util.List;

public class CountSubarraysWithSumAndMaxAtMost {
    public static long countSubarraysWithSumAndMaxAtMost(List<Integer> nums, long k, long M) {

        long con = 0;
        for (int i = 0; i < nums.size(); i++) {
            long sum =0;
            for(int j = i;j<nums.size();j++){
                if(nums.get(j) > M){
                    break;
                }
                sum += nums.get(j);
                if(sum == k ){
                    con++;
                }
            }
        }
        return con;
    }
}
