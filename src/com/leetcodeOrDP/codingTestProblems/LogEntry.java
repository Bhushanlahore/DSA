package com.leetcodeOrDP.codingTestProblems;

class LogEntry {

    private final double timestamp; // FIXED (was String)
    private final String licensePlate;
    private final String boothType;
    private final int location;
    private final String direction;

    public LogEntry(String logLine) {
        String[] tokens = logLine.split(" ");

        this.timestamp = Double.parseDouble(tokens[0]); // FIXED
        this.licensePlate = tokens[1];
        this.boothType = tokens[3];

        this.location = Integer.parseInt(tokens[2].substring(0, tokens[2].length() - 1));

        String directionLetter = tokens[2].substring(tokens[2].length() - 1);

        if (directionLetter.equals("E")) {
            this.direction = "EAST";
        } else if (directionLetter.equals("W")) {
            this.direction = "WEST";
        } else {
            throw new IllegalArgumentException();
        }
    }

    public double getTimestamp() {
        return timestamp;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getBoothType() {
        return boothType;
    }

    public int getLocation() {
        return location;
    }

    public String getDirection() {
        return direction;
    }

    @Override
    public String toString() {
        return "LogEntry{" +
                "timestamp=" + timestamp +
                ", licensePlate='" + licensePlate + '\'' +
                ", location=" + location +
                ", direction='" + direction + '\'' +
                ", boothType='" + boothType + '\'' +
                '}';
    }
}
