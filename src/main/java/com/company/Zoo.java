package com.company;

import com.company.abstracts.Animal;

import java.util.*;

public class Zoo {
    private Map<Integer, Animal> animals;  // integer is a serial number of Animal in thr Zoo

    public Zoo() {
        this.animals = new HashMap<Integer, Animal>();
    }

    /**
     * Adds an animal to the zoo with a unique serial number.
     * @param animal The animal to be added to the zoo.
     */
    public void addAnimal (Animal animal) {
        animals.put(animal.getSerialNumber(), animal);
    }

    /**
     * Gets a list of all animals in Zoo
     * @return list of the animals
     */
    public List<Animal> getAllAnimals () {
        return new ArrayList<>(animals.values());
    }
}
