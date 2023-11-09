package org.todeschini.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise029Test {

    @Test
    public void testCalculateSimpleInterestStandardValues() {
        assertEquals(Exercise029.calculateSimpleInterest(1.0,2.0,3.0), 0.06);
    }

    @Test
    public void testCalculateSimpleInterestWithZeroRate() {
        assertEquals(Exercise029.calculateSimpleInterest(1.0,0.0,3.0), 0.0);
    }

    @Test
    public void testCalculateSimpleInterestWithZeroTime() {
        assertEquals(Exercise029.calculateSimpleInterest(1.0,2.0,0.0), 0.0);
    }

    @Test
    public void testCalculateSimpleInterestWithZeroPrincipal() {
        assertEquals(Exercise029.calculateSimpleInterest(0.0,2.0,3.0), 0.0);
    }



}