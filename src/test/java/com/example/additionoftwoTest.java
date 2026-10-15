
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

    @Test
    void testAddition() {
        assertEquals(30, Addition.add(10, 20));
    }

    @Test
    void testNegativeNumbers() {
        assertEquals(-5, Addition.add(-2, -3));
    }

    @Test
    void testZero() {
        assertEquals(5, Addition.add(5, 0));
    }
}
