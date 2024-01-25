package com.company.animals;

import com.company.abstracts.Animal;
import com.company.interfaces.Predator;

import java.util.Date;

public class Cat extends Animal implements Predator {

    public Cat() {}

    public Cat(Integer serialNumber, String name, Date birthday)
    {
        super(serialNumber, name, birthday);
    }

    @Override
    public String saySomething() {
        return "Meow";
    }

    @Override
    public String eatMeet() {
        return "The cat is eating the meet";
    }

    @Override
    public String hunting() {
        return "The cat is hunting";
    }
}
