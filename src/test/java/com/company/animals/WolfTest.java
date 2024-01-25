package com.company.animals;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class WolfTest {
    @Test
    public void testDefaultConstructor() {
        Wolf wolf = new Wolf();
        assertNotNull(wolf, "Default constructor should create a non-null Wolf object");
    }

    @Test
    public void testParameterizedConstructor() {
        Date birthday = new Date();
        Wolf wolf = new Wolf(101, "Akela", birthday);
        assertEquals(101, wolf.getSerialNumber(), "Serial number should match the provided value");
        assertEquals("Akela", wolf.getName(), "Name should match the provided value");
        assertEquals(birthday, wolf.getBirthday(), "Birthday should match the provided value");
    }

    @Test
    public void testSaySomething() {
        Wolf wolf = new Wolf();
        String sound = wolf.saySomething();
        assertEquals("Wolf howl", sound, "saySomething should return 'Wolf howl'");
    }

    @Test
    public void testEatMeet() {
        Wolf wolf = new Wolf();
        String eating = wolf.eatMeet();
        assertEquals("The wolf is eating the meet", eating, "eatMeet should return 'The wolf is eating the meet'");
    }

    @Test
    public void testHunting() {
        Wolf wolf = new Wolf();
        String hunting = wolf.hunting();
        assertEquals("The wolf is hunting", hunting, "hunting should return 'The wolf is hunting'");
    }
}
