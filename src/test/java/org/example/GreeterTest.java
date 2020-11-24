package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreeterTest {

    @Test
    void greet() {
        // given
        var greeter = new Greeter();
        //when
        var greetresponse = greeter.greet();
        //then
        assertEquals("HELLO TEST!",greetresponse);
    }

    @Test
    void greetworld() {
        // given
        var greeter = new Greeter();
        //when
        var greetresponse = greeter.greet();
        //then
        assertNotEquals("HELLO WORLD!",greetresponse);
    }
}