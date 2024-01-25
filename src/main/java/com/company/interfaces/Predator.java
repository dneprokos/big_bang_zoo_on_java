package com.company.interfaces;

public interface Predator {
    default String sleep() {
        return "Predator is sleeping";
    }

    String eatMeet();

    String hunting();
}
