package com.example.talap.controllers;

public class Task1 {

    private String numbers;
    private String errorMessage;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    public float getAverageNumber() {
        if (numbers == null || numbers.isEmpty()) {
            return 0f;
        }

        String[] numberStrings = numbers.split(",");
        float result = 0;
        int count = 0;

        for (String numStr : numberStrings) {
            try {
                result += Integer.parseInt(numStr.trim());
                count++;
            } catch (NumberFormatException e) {
            }
        }

        return count > 0 ? result / count : 0f;
    }
}
