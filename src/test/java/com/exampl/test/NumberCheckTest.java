package com.exampl.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberCheckTest {

    NumberCheck numberCheck = new NumberCheck();

    @Test
    void testIsPositive() {
        assertTrue(numberCheck.isPositive(10), "10 should be positive");
    }

    @Test
    void testIsNotPositive() {
        assertFalse(numberCheck.isPositive(-5), "-5 should not be positive");
    }
}
