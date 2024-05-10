package org.todeschini.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise033Test {

    @Test
    void testMaxHandshakes() {
        var atual = Exercise033.maxHandshakes(30);
        assertEquals(atual, 435l);
    }

    @Test
    void testMaxHandshakes_5_should_be_10() {
        var atual = Exercise033.maxHandshakes(5);
        assertEquals(atual, 10l);
    }

    @Test
    void testMaxHandshakes_1_should_be_0() {
        var atual = Exercise033.maxHandshakes(1);
        assertEquals(atual, 0l);
    }

    @Test
    void testMaxHandshakes_10_should_be_45() {
        var atual = Exercise033.maxHandshakes(10);
        assertEquals(atual, 45l);
    }

    @Test
    void testMaxHandshakes_100_should_be_4950() {
        var atual = Exercise033.maxHandshakes(100);
        assertEquals(atual, 4950l);
    }

}