package com.company;

import com.company.abstracts.Animal;
import com.company.animals.Cat;
import com.company.animals.Dog;
import com.company.animals.Rabbit;
import com.company.animals.Wolf;
import com.company.interfaces.Predator;
import com.company.utils.DateHelpers;
import com.company.utils.SerialNumberHelper;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    /*
    Tasks:
    - using existing classes and interfaces and with common sense create dependencies
    - create two instances of each animal and put all of them in the List
    - create Zoo and put all animals in it
    - get from Zoo all Predators, call saySomething() for each of them
    - verify that in Zoo there are any Cat with age more than 5 year
    */

        //Prepare Animals
        SerialNumberHelper serialNumber = new SerialNumberHelper();
        List<Animal> bingBangAnimals = Arrays.asList(
                new Cat(serialNumber.getSerialNumber(), "Sheldon", DateHelpers.createDateYearsAgo(6)),
                new Cat(serialNumber.getSerialNumber(), "Leonard", DateHelpers.createDateYearsAgo(4)),
                new Dog(serialNumber.getSerialNumber(), "Penny", DateHelpers.createDateYearsAgo(2)),
                new Dog(serialNumber.getSerialNumber(), "Raj", DateHelpers.createDateYearsAgo(7)),
                new Wolf(serialNumber.getSerialNumber(), "Bernadette", DateHelpers.createDateYearsAgo(3)),
                new Wolf(serialNumber.getSerialNumber(), "Emily", DateHelpers.createDateYearsAgo(5)),
                new Rabbit(serialNumber.getSerialNumber(), "Howard", DateHelpers.createDateYearsAgo(3)),
                new Rabbit(serialNumber.getSerialNumber(), "Stuart", DateHelpers.createDateYearsAgo(3))
        );

        //Create and populate a Bing Bang Zoo
        Zoo bingBangZoo = new Zoo();
        for (Animal animal : bingBangAnimals) {
            bingBangZoo.addAnimal(animal);
        }

        //get from Zoo all Predators, call saySomething() for each of them
        for (Animal animal : bingBangZoo.getAllAnimals()) {
            if (animal instanceof Predator) {
                System.out.println(animal.saySomething());
            }
        }

        //verify that in Zoo there are any Cat with age more than 5 year
        boolean hasCatsOlderThanFive = bingBangZoo.getAllAnimals().stream()
                .filter(animal -> animal instanceof Cat)
                .anyMatch(cat -> cat.getAge() > 5);
        System.out.println(String.format("Is there any cat older than 5 years? %s", hasCatsOlderThanFive));
    }
}
