package org.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeTest {

    @Test
    void testNextSecond() {
        Time time = new Time(10, 22, 13);
        var nextTime = time.nextSecond();
        assertEquals(14, nextTime.getSecond());
        assertEquals(22, nextTime.getMinute());
        assertEquals(10, nextTime.getHour());

    }

    @Test
    void testPreviousSecond() {
        Time time = new Time(22, 10, 50);
        var previousTime = time.previousSecond();
        assertEquals(49, previousTime.getSecond());
        assertEquals(10, previousTime.getMinute());
        assertEquals(22, previousTime.getHour());

    }

}