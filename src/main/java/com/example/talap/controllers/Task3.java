package com.example.talap.controllers;

public class Task3 {

    private String number;
    private String errorMessage;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public int getReversedNumber() {
        if (this.number == null) {
            return 0;
        }
        int result = 0;
        int n = Integer.parseInt(this.number.trim());

        while (n != 0) {
            result = result * 10 + (n % 10);
            n = n / 10;
        }

        return result;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

}