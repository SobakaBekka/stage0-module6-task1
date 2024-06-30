package com.epam.mjc.stage0;

public class Bird extends Animal {
    // No-args constructor
    public Bird() {
        super("blue", 2, false);
    }

    // Override getDescription method
    @Override
    public String getDescription() {
        return super.getDescription() + " Moreover, it has 2 wings and can fly.";
    }
}
