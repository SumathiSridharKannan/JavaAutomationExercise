package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class SwimmingPoolTest {



    @Test
    @DisplayName("WaterTemp is 0 return ICE")
    void zeroTemperatureIsIce() {
        assertEquals(SwimmingPool.ICE, SwimmingPool.getMessageForWaterTemperature(0));

    }
    @Test
    @DisplayName("WaterTemp is 12 return COLD")
    void aboveZeroAndBelowNineteenIsCold() {
        assertEquals(SwimmingPool.COLD, SwimmingPool.getMessageForWaterTemperature(12));

    }

    @Test
    @DisplayName("WaterTemp is 20 return OPTIMAL")
    void twentyIsOptimal() {
        assertEquals(SwimmingPool.OPTIMAL, SwimmingPool.getMessageForWaterTemperature(20));

    }

    @Test
    @DisplayName("WaterTemp is 22 return OPTIMAL")
    void twentyTwoIsOptimal() {
        assertEquals(SwimmingPool.OPTIMAL, SwimmingPool.getMessageForWaterTemperature(22));

    }

    @Test
    @DisplayName("WaterTemp is 28 return too Hot")
    void twentyEightIsTooHot() {
        assertEquals(SwimmingPool.TOO_HOT, SwimmingPool.getMessageForWaterTemperature(28));

    }


}