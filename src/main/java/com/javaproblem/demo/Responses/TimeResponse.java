package com.javaproblem.demo.Responses;

import com.javaproblem.demo.models.Time;

public class TimeResponse {

    private Time response;

    public TimeResponse(Time response) {
        this.response = response;
    }

    public Time getResponse() {
        return response;
    }

    public void setResponse(Time response) {
        this.response = response;
    }
}
