package com.company.animals;

import com.company.abstracts.Animal;
import com.company.interfaces.Predator;

import java.util.Date;

public class Wolf extends Animal implements Predator {
    public Wolf() {}

    public Wolf(Integer serialNumber, String name, Date birthday)
    {
        super(serialNumber, name, birthday);
    }

    @Override
    public String saySomething() {
        return "Wolf howl";
    }

    @Override
    public String eatMeet() {
        return "The wolf is eating the meet";
    }

    @Override
    public String hunting() {
        return "The wolf is hunting";
    }
}
