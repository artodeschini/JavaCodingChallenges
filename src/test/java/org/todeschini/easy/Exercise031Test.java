package org.todeschini.easy;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class Exercise031Test {

    @Test
    void testFindYoungestBrotherInSingleBrotherWithStream() {
        Exercise031.Brother b1 = new Exercise031.Brother("a", 1);
        assertEquals(b1, Exercise031.findYoungestBrotherWithStream(new Exercise031.Brother[] {b1}));
    }

    @Test
    void testFindYoungestBrotherInSingleBrother() {
        Exercise031.Brother b1 = new Exercise031.Brother("a", 1);
        assertEquals(b1, Exercise031.findYoungestBrother(new Exercise031.Brother[] {b1}));
    }

    @Test
    void testFindYoungestBrotherInEmptyArray() {
        assertThrows(NoSuchElementException.class, () -> Exercise031.findYoungestBrother(new Exercise031.Brother[] {}));
    }

    @Test
    void testFindYoungestBrotherInEmptyArrayWithStream() {
        assertThrows(NoSuchElementException.class, () -> Exercise031.findYoungestBrotherWithStream(new Exercise031.Brother[] {}));
    }

    @Test
    void testFindYoungestBrotherInTwoBrothersWithStream() {
        Exercise031.Brother b1 = new Exercise031.Brother("a", 1);
        assertEquals(b1, Exercise031.findYoungestBrotherWithStream(
                new Exercise031.Brother[] {b1, new Exercise031.Brother("b", 2)}));
    }

    @Test
    void testFindYoungestBrotherInTwoBrothers() {
        Exercise031.Brother b1 = new Exercise031.Brother("a", 1);
        assertEquals(b1, Exercise031.findYoungestBrother(
                new Exercise031.Brother[] {b1, new Exercise031.Brother("b", 2)}));
    }

    @Test
    void testFindYoungestBrotherInMultipleBrothers() {
        var brothers = new Exercise031.Brother[] {
                new Exercise031.Brother("a", 1),
                new Exercise031.Brother("b", 2),
                new Exercise031.Brother("c", 3)
        };
        assertEquals(brothers[0], Exercise031.findYoungestBrother(brothers));
    }

    @Test
    void testFindYoungestBrotherInMultipleBrothersWithStream() {
        var brothers = new Exercise031.Brother[] {
                new Exercise031.Brother("a", 1),
                new Exercise031.Brother("b", 2),
                new Exercise031.Brother("c", 3)
        };
        assertEquals(brothers[0], Exercise031.findYoungestBrotherWithStream(brothers));
    }
}