package org.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {
    @Test
    void constructorExample() {
        //given name and lastname
        var name = "Jiv";
        var lastname = "Sri";

        //create object with the given values

        Person jivSri = new Person(name, lastname);

        //Getters has to retrieve the values

        assertEquals(name, jivSri.getName());
        assertEquals(lastname, jivSri.getLastName());


    }

    @Test
    void testDefaultPersonValue() {

        var defaultPerson = new Person();
        assertEquals("Joe", defaultPerson.getName());
        assertEquals("John", defaultPerson.getLastName());
    }

}