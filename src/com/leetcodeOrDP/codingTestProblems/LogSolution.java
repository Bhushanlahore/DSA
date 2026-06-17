package com.leetcodeOrDP.codingTestProblems;

import java.util.Arrays;
import java.util.List;

public class LogSolution {

    public static void main(String[] args) {

        // Sample data (no need for file)
        List<String> logs = Arrays.asList(
                "90750.191 JOX304 250E ENTRY",
                "90750.191 MH1244 270E ENTRY",
                "91081.684 JOX304 260E MAINROAD",
                "9" +
                        "1082.101 THX138 110E ENTRY",
                "90750.191 MH1422 250E EXIT",
                "91483.251 JOX304 270E MAINROAD",
                "91873.920 THX138 120E MAINROAD",
                "91874.493 JOX304 280E EXIT",
                "91982.102 THX138 290E EXIT",
                "92301.302 THX138 300E ENTRY",
                "92371.302 THX138 310E EXIT"
        );

        LogFile logFile = new LogFile(logs);

        System.out.println("Total Logs: " + logFile.size());
        System.out.println("Total Journeys: " + logFile.countJourneys1());

        System.out.println("Avarage Journey: "+logFile.averageJourneyDistance());
        System.out.println("Fastest Car: "+logFile.findFastestCar());
        System.out.println("Detect toll Skipped car"+logFile.detectSkippingCars());
        System.out.println("Peak Highway Uses: "+logFile.peakHighwayUsage());

        System.out.println("======================================New LogFile ============================================");

        NewLogFIle newLogFIle = new NewLogFIle(logs);

        System.out.println("Total Journeys: " + newLogFIle.countJourneys());
        System.out.println("Total Journeys 2: " + newLogFIle.countJourneys2());
        System.out.println("Avarage Journey: "+newLogFIle.getAvarageJourneyDistance());
        System.out.println("Fastest Car: "+newLogFIle.findFastestCar());

    }
}
