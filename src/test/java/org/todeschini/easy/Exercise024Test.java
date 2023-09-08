package org.todeschini.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise024Test {

    @Test
    void testProfitScenario() {
        assertEquals(19.0d, Exercise024.calculateProfitOrLoss(1.0d, 20.0d));
    }

    @Test
    void testNoProfitNoLossScenario() {
        assertEquals(0.0d, Exercise024.calculateProfitOrLoss(20.0d, 20.0d));
    }

    @Test
    void testLossScenario() {
        assertEquals(-1.0d, Exercise024.calculateProfitOrLoss(21.0d, 20.0d));
    }
}