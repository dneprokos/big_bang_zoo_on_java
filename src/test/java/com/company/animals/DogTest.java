package com.company.animals;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DogTest {
    @Test
    public void testDefaultConstructor() {
        Dog dog = new Dog();
        assertNotNull(dog, "Default constructor should create a non-null Dog object");
    }

    @Test
    public void testParameterizedConstructor() {
        Date birthday = new Date();
        Dog dog = new Dog(456, "Buddy", birthday);
        assertEquals(456, dog.getSerialNumber());
        assertEquals("Buddy", dog.getName());
        assertEquals(birthday, dog.getBirthday());
    }

    @Test
    public void testSaySomething() {
        Dog dog = new Dog();
        String sound = dog.saySomething();
        assertEquals("Dog barks", sound, "saySomething should return 'Dog barks'");
    }

    @Test
    public void testEatMeat() {
        Dog dog = new Dog();
        String eating = dog.eatMeet();
        assertEquals("The dog is eating the meat", eating, "eatMeat should return 'The dog is eating the meat'");
    }
}
