package com.company.interfaces;

public interface Herbivore {
    default String sleep() {
        return "Herbivore is sleeping";
    }

    String eatPlants();
}
