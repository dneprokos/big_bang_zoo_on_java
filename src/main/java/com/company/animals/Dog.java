package com.company.animals;

import com.company.abstracts.Animal;
import com.company.interfaces.Predator;

import java.util.Date;

public class Dog extends Animal implements Predator {

    public Dog() {}

    public Dog(Integer serialNumber, String name, Date birthday)
    {
        super(serialNumber, name, birthday);
    }

    @Override
    public String saySomething() {
        return "Dog barks";
    }

    @Override
    public String eatMeet() {
        return "The dog is eating the meat";
    }

    @Override
    public String hunting() {
        return "The dog is hunting";
    }
}
