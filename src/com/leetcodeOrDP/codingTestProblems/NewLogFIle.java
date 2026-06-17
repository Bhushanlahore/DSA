package com.leetcodeOrDP.codingTestProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NewLogFIle {


    List<LogEntry> logEntries;

    public NewLogFIle(List<String> lines) {
        this.logEntries = new ArrayList<>();

        for (String line : lines) {
            logEntries.add(new LogEntry(line));
        }
    }

    public int size() {
        return logEntries.size();
    }


    public int countJourneys(){

        int journeys = 0;

        for(LogEntry entry: logEntries){

            if("EXIT".equals(entry.getBoothType())){
                journeys++;
            }
        }

        return journeys;
    }

    public int countJourneys2(){

        Map<String, LogEntry> activeCars = new HashMap<>();

        int journey =0;

        for(LogEntry entry: logEntries){
            if("ENTRY".equals(entry.getBoothType())){
                activeCars.put(entry.getLicensePlate(), entry);
            }else if("EXIT".equals(entry.getBoothType())){
                if(activeCars.containsKey(entry.getLicensePlate())){
                    journey++;
                    activeCars.remove(entry.getLicensePlate());
                }
            }
        }

        return journey;
    }

    public double getAvarageJourneyDistance(){

        int journey = 0;
        int totalDistance=0;

        Map<String, LogEntry> activeCars = new HashMap<>();

        for(LogEntry logEntry: logEntries){

            if("ENTRY".equals(logEntry.getBoothType())){

                activeCars.put(logEntry.getLicensePlate(), logEntry);
            }

            if("EXIT".equals(logEntry.getBoothType())){
                LogEntry start = activeCars.get(logEntry.getLicensePlate());

                if(start != null){

                    int distance = Math.abs(logEntry.getLocation() - start.getLocation());
                    totalDistance += distance;
                    journey++;
                }

                activeCars.remove(logEntry.getLicensePlate());
            }
        }
        return journey == 0?0: (double) totalDistance /journey;
    }

    public String findFastestCar(){
        Map<String, LogEntry> activeCars = new HashMap<>();
        double maxSpeed = 0;
        String fastCar ="";
        for(LogEntry entry: logEntries){
            String plate = entry.getLicensePlate();

            if("ENTRY".equals(entry.getBoothType())){
                activeCars.put(plate, entry);
            }
            else
            if("EXIT".equals(entry.getBoothType())) {

                LogEntry start = activeCars.get(plate);
                if(start != null){
                double distance = Math.abs(entry.getLocation() - start.getLocation());
                double time = entry.getTimestamp() - start.getTimestamp();

                double speed = distance / time;

                if (speed > maxSpeed) {
                    maxSpeed = speed;
                    fastCar = plate;
                }

                activeCars.remove(plate);
            }
            }
        }

        return  fastCar;

    }


}
