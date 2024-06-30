package com.epam.mjc.stage0;

public class Animal {

    private final String color;
    private final int numberOfPaws;
    private final boolean hasFur;


    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String pawWord = (numberOfPaws == 1) ? "paw" : "paws";
        String furWord = hasFur ? "a" : "no";
        return "This animal is mostly " + color + ". It has " + numberOfPaws + " " + pawWord + " and " + furWord + " fur.";
    }
}
