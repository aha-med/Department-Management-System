package com.department.entity;

public class ErrorMessage {
    private String message;

    @Override
    public String toString() {
        return "ErrorMessage{" +
                "message='" + message + '\'' +
                '}';
    }

    public String getMessage() {
        return message;
    }

    public ErrorMessage(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
