package com.leetcodeOrDP.codingTestProblems;

import java.util.*;

class LogFile {

    List<LogEntry> logEntries;

    public LogFile(List<String> lines) {
        this.logEntries = new ArrayList<>();

        for (String line : lines) {
            logEntries.add(new LogEntry(line));
        }
    }

    public int size() {
        return logEntries.size();
    }

    // ✅ Count journeys (simple version: count EXIT)
    public int countJourneys() {
        int count = 0;

        for (LogEntry entry : logEntries) {
            if ("EXIT".equals(entry.getBoothType())) {
                count++;
            }
        }

        return count;
    }

    public int countJourneys1() {
        Map<String, Boolean> activeCars = new HashMap<>();
        int journeys = 0;

        for (LogEntry entry : logEntries) {
            String plate = entry.getLicensePlate();
            String booth = entry.getBoothType();

            if ("ENTRY".equals(booth)) {
                activeCars.put(plate, true);
            }
            else if ("EXIT".equals(booth)) {
                if (activeCars.containsKey(plate)) {
                    journeys++;
                    activeCars.remove(plate);
                }
            }
        }
        return journeys;
    }

    public double averageJourneyDistance() {

        Map<String, LogEntry> entryMap = new HashMap<>();
        int totalDistance = 0;
        int journeys = 0;

        for (LogEntry entry : logEntries) {

            String plate = entry.getLicensePlate();

            if ("ENTRY".equals(entry.getBoothType())) {
                entryMap.put(plate, entry);
            }

            if ("EXIT".equals(entry.getBoothType())) {

                LogEntry start = entryMap.get(plate);

                if (start != null) {
                    int distance = Math.abs(entry.getLocation() - start.getLocation());
                    totalDistance += distance;
                    journeys++;

                    entryMap.remove(plate);
                }
            }
        }
        return journeys == 0 ? 0 : (double) totalDistance / journeys;
    }

    public String findFastestCar() {

        Map<String, LogEntry> entryMap = new HashMap<>();

        double maxSpeed = 0;
        String fastestCar = "";

        for (LogEntry entry : logEntries) {

            String plate = entry.getLicensePlate();

            if ("ENTRY".equals(entry.getBoothType())) {
                entryMap.put(plate, entry);
            }

            else if ("EXIT".equals(entry.getBoothType())) {

                LogEntry start = entryMap.get(plate);

                if (start != null) {

                    double distance = Math.abs(entry.getLocation() - start.getLocation());
                    double time = entry.getTimestamp() - start.getTimestamp();

                    double speed = distance / time;

                    if (speed > maxSpeed) {
                        maxSpeed = speed;
                        fastestCar = plate;
                    }

                    entryMap.remove(plate);
                }
            }
        }

        return fastestCar;
    }

    public Set<String> detectSkippingCars() {

        Map<String, Boolean> activeCars = new HashMap<>();
        Set<String> fraudCars = new HashSet<>();

        for (LogEntry entry : logEntries) {
            String plate = entry.getLicensePlate();
            String booth = entry.getBoothType();

            if ("ENTRY".equals(booth)) {
                activeCars.put(plate, true);
            }
            else if ("MAINROAD".equals(booth)) {
                if (!activeCars.containsKey(plate)) {
                    fraudCars.add(plate);
                }
            }
            else if ("EXIT".equals(booth)) {

                if (!activeCars.containsKey(plate)) {
                    fraudCars.add(plate);
                }
                activeCars.remove(plate);
            }
        }

        return fraudCars;
    }

    public int peakHighwayUsage() {
        int currentCars = 0;
        int maxCars = 0;
        for (LogEntry entry : logEntries) {
            if ("ENTRY".equals(entry.getBoothType())) {
                currentCars++;
            }
            else if ("EXIT".equals(entry.getBoothType())) {
                currentCars--;
            }
            maxCars = Math.max(maxCars, currentCars);
        }
        return maxCars;
    }
}

