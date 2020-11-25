package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaOperatorsTest {

    JavaOperators javaoperators = new JavaOperators();

    @Nested
    class IncrementMethodTest {

        @Test
        @DisplayName("increment 0 to 1")
        void increment() {
            assertEquals(1, javaoperators.increment(0));

        }

        @Test
        @DisplayName("increment -1 to 0")
        void incrementminus1() {
            assertEquals(0, javaoperators.increment(-1));

        }
    }

    @Nested
    class ArithmeticMethodTest {

        @Test
        @DisplayName("add 10 and  11")
        void add() {
            assertEquals(21, javaoperators.add(10, 11));

        }

        @Test
        @DisplayName("sub 10 and  11")
        void sub() {
            assertEquals(-1, javaoperators.sub(10, 11));

        }

        @Test
        @DisplayName("mul 10 and  11")
        void mul() {
            assertEquals(110, javaoperators.mul(10, 11));

        }

        @Test
        @DisplayName("div 100 and  10")
        void div() {
            assertEquals(10, javaoperators.div(100, 10));

        }
    }

    @Nested
    class LogicalOperatorsTest {
        @Test
        @DisplayName("true && true returns true")
        void logicalAnd() {
            assertTrue(javaoperators.logicalAnd(true, true));

        }
        @Test
        @DisplayName("b1 || b2 returns true")
        void logicalOr() {
            assertTrue(javaoperators.logicalOr(true, true));

        }

        @Test
        @DisplayName("11>=10 returns The value is greater or equal 10")
        void infoAboutNumber() {
            assertEquals("The value is greater or equal 10", javaoperators.infoAboutNumber(11));

        }

        @Test
        @DisplayName("Hello returns true")
        void stringHelloTrue() {
            assertTrue(javaoperators.isString("Hello"));

        }
        @Test
        @DisplayName("Object is not a string returns False")
        void objectFalse() {
             assertFalse(javaoperators.isString(new Object()));

        }


        @Test
        @DisplayName("3==4 returns false")
        void isEqual() {
            assertFalse(javaoperators.isEqual(3, 4));

        }


        @Test
        @DisplayName("3!=4 returns true")
        void isNotEqual() {
            assertTrue(javaoperators.isNotEqual(3, 4));

        }

        @Test
        @DisplayName("3<=4 returns true")
        void isLessOrEqualTo() {
            assertTrue(javaoperators.isLessOrEqualTo(3, 4));

        }

        @Test
        @DisplayName("3>=4 returns true")
        void isGreaterOrEqualTo() {
            assertFalse(javaoperators.isGreaterOrEqualTo(3, 4));

        }
    }
}