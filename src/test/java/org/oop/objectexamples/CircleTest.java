package org.oop.objectexamples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {
    Circle circleNoArg = new Circle();
    Circle circleArg = new Circle(10.0);

    @Test
    void getAreaNoArg() {
        assertEquals(Math.PI, circleNoArg.getArea());

    }

    @Test
    void getAreaArg() {
        var expectedArea = (Math.PI * 10 * 10);
        assertEquals(expectedArea, circleArg.getArea());

    }
}