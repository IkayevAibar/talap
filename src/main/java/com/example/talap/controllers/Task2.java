package com.example.talap.controllers;

public class Task2 {

    private String word;

    public boolean getIsPalindrome() {
        if (word == null) {
            return false;
        }

        this.word = this.word.replaceAll("[^a-zA-Z]", "");

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

}