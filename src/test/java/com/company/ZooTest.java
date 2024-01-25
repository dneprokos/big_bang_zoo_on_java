package com.company;

import com.company.abstracts.Animal;
import com.company.animals.Cat;
import com.company.animals.Dog;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ZooTest {
    private Zoo zoo;

    @BeforeEach
    public void setUp() {
        zoo = new Zoo();
    }

    @Test
    public void testAddAnimal() {
        Animal animal = new Cat(1, "Whiskers", new Date());
        zoo.addAnimal(animal);
        assertFalse(zoo.getAllAnimals().isEmpty(), "Zoo should contain animals after adding");
        assertTrue(zoo.getAllAnimals().contains(animal), "Zoo should contain the added animal");
    }

    @Test
    public void testGetAllAnimals() {
        Animal cat = new Cat(1, "Whiskers", new Date());
        Animal dog = new Dog(2, "Buddy", new Date());
        zoo.addAnimal(cat);
        zoo.addAnimal(dog);
        List<Animal> animals = zoo.getAllAnimals();
        assertEquals(2, animals.size(), "Zoo should contain two animals");
        assertTrue(animals.contains(cat), "Zoo should contain the added cat");
        assertTrue(animals.contains(dog), "Zoo should contain the added dog");
    }

    @Test
    public void testUniqueSerialNumber() {
        Animal firstCat = new Cat(1, "Whiskers", new Date());
        Animal secondCat = new Cat(1, "Shadow", new Date());
        zoo.addAnimal(firstCat);
        zoo.addAnimal(secondCat); // Assuming the same serial number should override the previous entry
        List<Animal> animals = zoo.getAllAnimals();
        assertEquals(1, animals.size(), "Zoo should contain only one animal with a unique serial number");
        assertTrue(animals.contains(secondCat), "Zoo should contain the last animal added with the same serial number");
    }
}
