package com.javaproblem.demo.Requests;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class TimeRequest {

    private String time;

    private  int zone;
    private String timezone = "utc";

    public TimeRequest(String time, int zone){
        this.time = time;
        this.zone = zone;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }

    @Override
    public String toString() {
        return "Time{" +
                "time='" + time + '\'' +
                ", zone='" + zone + '\'' +
                '}';
    }

}
