package com.company.animals;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RabbitTest {
    @Test
    public void testDefaultConstructor() {
        Rabbit rabbit = new Rabbit();
        assertNotNull(rabbit, "Default constructor should create a non-null Rabbit object");
    }

    @Test
    public void testParameterizedConstructor() {
        Date birthday = new Date();
        Rabbit rabbit = new Rabbit(789, "Thumper", birthday);
        assertEquals(789, rabbit.getSerialNumber(), "Serial number should match the provided value");
        assertEquals("Thumper", rabbit.getName(), "Name should match the provided value");
        assertEquals(birthday, rabbit.getBirthday(), "Birthday should match the provided value");
    }

    @Test
    public void testSaySomething() {
        Rabbit rabbit = new Rabbit();
        String sound = rabbit.saySomething();
        assertEquals("Rabbit cluck", sound, "saySomething should return 'Rabbit cluck'");
    }

    @Test
    public void testEatPlants() {
        Rabbit rabbit = new Rabbit();
        String eating = rabbit.eatPlants();
        assertEquals("The rabbit is eating the plants", eating, "eatPlants should return 'The rabbit is eating the plants'");
    }
}
