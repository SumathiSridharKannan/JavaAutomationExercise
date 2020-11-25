package org.example;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LoopsTest {

    @Nested
    class returnElementOfArray {

        @Test
        void returnFirstIndexForZeroElement_oAt3() {
            int[] arrayToTest = new int[]{1, 2, 3, 0, 5, 6, 7};
            assertEquals(3, Loops.returnFirstIndexForZeroElement(arrayToTest));

        }

        @Test
        void returnFirstIndexForZeroElement_no0() {
            int[] arrayToTest = new int[]{1, 2, 3, 4, 5, 6, 7};
            assertEquals(-1, Loops.returnFirstIndexForZeroElement(arrayToTest));

        }

    }

    @Nested
    class returnSumOfElements {

        @Test
        void returnSum_6Elements() {
            int[] arrayToTest = new int[]{1, 2, 3, 4, 5, 6};
            assertEquals(21, Loops.returnSumOfAllElements(arrayToTest));

        }

    }


}