package com.sms.payload;

public class SmsRequest {
    private String toNumber;
    private String message;

    public SmsRequest() {
    }

    public SmsRequest(String toNumber, String message) {
        this.toNumber = toNumber;
        this.message = message;
    }

    public String getToNumber() {
        return toNumber;
    }

    public void setToNumber(String toNumber) {
        this.toNumber = toNumber;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}