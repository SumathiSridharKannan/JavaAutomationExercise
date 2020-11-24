package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataTypesTest {

    DataTypes dataTypes= new DataTypes();

    @Test
    void testBoolean() {
      assertFalse(dataTypes.bol);
    }

    @Test
    //@DisplayName("assert char")
    void testChar() {
       assertEquals('\u0000', dataTypes.aChar);

    }
    @Test
    void testbyte() {
        assertEquals(0,dataTypes.aByte);
    }
    @Test
    void testshort(){
        assertEquals(0,dataTypes.aShort);
    }
    @Test
    void testint() {
        assertEquals(0,dataTypes.anInt);
    }
    @Test
    void testlong() {
        assertEquals(0.0,dataTypes.aLong);
    }
    @Test
    void testfloat() {
        assertEquals(0.0,dataTypes.aFloat);
    }
    @Test
    void testDouble() {
        assertEquals(0.0,dataTypes.aDouble);
    }
    @Test
    void testString() {
        assertNull(dataTypes.aString);
    }



}