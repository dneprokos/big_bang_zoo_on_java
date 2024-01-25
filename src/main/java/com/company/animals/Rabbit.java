package com.company.animals;

import com.company.abstracts.Animal;
import com.company.interfaces.Herbivore;

import java.util.Date;

public class Rabbit extends Animal implements Herbivore {
    public Rabbit() {}

    public Rabbit(Integer serialNumber, String name, Date birthday)
    {
        super(serialNumber, name, birthday);
    }

    @Override
    public String saySomething() {
        return "Rabbit cluck";
    }

    @Override
    public String eatPlants() {
        return "The rabbit is eating the plants";
    }
}
