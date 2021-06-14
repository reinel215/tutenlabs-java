package com.javaproblem.demo.models;


public class Time {

    private String time;
    private String timezone = "utc";

    public Time(String time) {
        this.time = time;
    }


    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
}
