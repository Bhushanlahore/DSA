package com.leetcodeOrDP.codingTestProblems;

import java.util.*;

public class GymMembership {

    public static String getAverageWorkoutDurations(
            List<Integer> memberIds,
            List<Integer> workoutMemberIds,
            List<Integer> startTimes,
            List<Integer> endTimes) {

        Map<Integer, Long> totalDuration = new HashMap<>();
        Map<Integer, Integer> countMap = new HashMap<>();

        int m = workoutMemberIds.size();

        for (int i = 0; i < m; i++) {
            int memberId = workoutMemberIds.get(i);
            int duration = endTimes.get(i) - startTimes.get(i);

            totalDuration.put(memberId,
                    totalDuration.getOrDefault(memberId, 0L) + duration);

            countMap.put(memberId,
                    countMap.getOrDefault(memberId, 0) + 1);
        }

        // Sort memberIds
        Collections.sort(memberIds);

        StringBuilder result = new StringBuilder();

        for (int memberId : memberIds) {
            if (countMap.containsKey(memberId)) {
                long total = totalDuration.get(memberId);
                int count = countMap.get(memberId);

                double avg = (double) total / count;

                if (result.length() > 0) {
                    result.append(",");
                }

               // result.append(memberId).append(":").append(String.format("%.1f", avg));
                result.append(memberId).append(":").append(avg);
            }
        }

        return result.toString();
    }

    public static  void main(String args[]){

        List<Integer> memberIds = Arrays.asList(12, 22, 31);

        List<Integer> workoutMemberIds = Arrays.asList(12, 12, 22, 22, 31, 31);

        List<Integer> startTimes = Arrays.asList(0, 10, 0, 20, 0, 50);

        List<Integer> endTimes = Arrays.asList(20, 40, 40, 80, 70, 125);

        String str = getAverageWorkoutDurations(memberIds, workoutMemberIds, startTimes, endTimes);

        System.out.println(str);
    }
}
