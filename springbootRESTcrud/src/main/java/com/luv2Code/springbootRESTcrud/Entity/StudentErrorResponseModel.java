package com.luv2Code.springbootRESTcrud.Entity;

import org.springframework.http.HttpStatus;

//1 step
public class StudentErrorResponseModel {
    private int status;
    private String message;

    private long timeScapm;

    public StudentErrorResponseModel() {
    }

    public StudentErrorResponseModel(int status, String message, long timeScapm) {
        this.status = status;
        this.message = message;
        this.timeScapm = timeScapm;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimeScapm() {
        return timeScapm;
    }

    public void setTimeScapm(long timeScapm) {
        this.timeScapm = timeScapm;
    }
}
