package org.oop.inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ToStringTest {
    // create Person, Student, Staff objects
    // Test if their toString methods are overriden (contain the necessary data), using String API


    @Test
    void toStringPerson() {
        var name = "Sumathi";
        var address = "Denmark";
        var person = new Person(name, address);
        assertTrue(person.toString().contains(name));

    }
}
