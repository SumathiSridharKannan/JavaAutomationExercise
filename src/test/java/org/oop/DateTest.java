package org.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DateTest {
    // Let's pretend we don't create object but call a REST API
    Date myDate = new Date(22, 12, 2020);

    @Test
    void setMyDate() {
        // given
        assertEquals(22, myDate.getDay());
        assertEquals(12, myDate.getMonth());
        assertEquals(2020, myDate.getYear());
        // when
        myDate.setNewDate(23, 11, 2020);
        // then
        assertEquals(23, myDate.getDay());
        assertEquals(11, myDate.getMonth());
        assertEquals(2020, myDate.getYear());

    }


}