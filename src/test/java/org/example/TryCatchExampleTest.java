package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TryCatchExampleTest {
    String [] strings ={"one","two","three"};
    TryCatchExample tryCatchExample = new TryCatchExample();

    @Test
    void noTryCatch(){
        assertThrows(ArrayIndexOutOfBoundsException.class,
                ()->tryCatchExample.noTryCatch(strings,5)
        );

    }
    @Test
    void withTryCatch(){
assertEquals("An exception was caught",tryCatchExample.withTryCatch(strings,5));

    }

}