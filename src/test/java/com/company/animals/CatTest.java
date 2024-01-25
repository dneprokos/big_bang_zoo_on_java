package com.company.animals;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CatTest {
    @Test
    public void testDefaultConstructor() {
        Cat cat = new Cat();
        assertNotNull(cat, "Default constructor should create a non-null Cat object");
    }

    @Test
    public void testParameterizedConstructor() {
        Date birthday = new Date();
        Cat cat = new Cat(123, "Whiskers", birthday);
        assertEquals(123, cat.getSerialNumber());
        assertEquals("Whiskers", cat.getName());
        assertEquals(birthday, cat.getBirthday());
    }

    @Test
    public void testSaySomething() {
        Cat cat = new Cat();
        String sound = cat.saySomething();
        assertEquals("Meow", sound, "saySomething should return 'Meow'");
    }

    @Test
    public void testEatMeet() {
        Cat cat = new Cat();
        String eating = cat.eatMeet();
        assertEquals("The cat is eating the meet", eating, "eatMeet should return 'The cat is eating the meet'");
    }

    @Test
    public void testHunting() {
        Cat cat = new Cat();
        String hunting = cat.hunting();
        assertEquals("The cat is hunting", hunting, "hunting should return 'The cat is hunting'");
    }
}
