package org.todeschini.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise027Test {

    @Test
    public void testCalculateCubeVolumeWithZeroEdge() {
        assertEquals(Exercise027.calculateCubeVolume(0), 0.0);
    }

    @Test
    public void testCalculateCubeVolumeWithDecimalEdge() {
        assertEquals(Exercise027.calculateCubeVolume(3.3), 35.937);
    }

    @Test
    public void testCalculateCubeVolumeWithIntegerEdge() {
        assertEquals(Exercise027.calculateCubeVolume(3), 27.0);
    }

    @Test
    public void testCalculateCubeVolumeWithNegativeEdge() {
        assertEquals(Exercise027.calculateCubeVolume(-3), -27.0);
    }
}