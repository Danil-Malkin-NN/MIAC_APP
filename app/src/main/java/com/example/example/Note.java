package com.example.example;

public class Note {
    private String timestamp, lowPressure, highPressure, pulse;

    @Override
    public String toString() {
        return
                "Timestamp='" + timestamp + '\'' +
                ", lowPressure='" + lowPressure + '\'' +
                ", highPressure='" + highPressure + '\'' +
                ", pulse='" + pulse + '\'' +
                '}';
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getLowPressure() {
        return lowPressure;
    }

    public void setLowPressure(String lowPressure) {
        this.lowPressure = lowPressure;
    }

    public String getHighPressure() {
        return highPressure;
    }

    public void setHighPressure(String highPressure) {
        this.highPressure = highPressure;
    }

    public String getPulse() {
        return pulse;
    }

    public void setPulse(String pulse) {
        this.pulse = pulse;
    }
}
