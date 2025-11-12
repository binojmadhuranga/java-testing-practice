package com.exampl.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NumberUtilsTest {

    @Test
     void testIsEven_WithEvenNumber() {
        NumberUtils utils = new NumberUtils();
        assertTrue(utils.isEven(4), "4 should be even");
    }

    @Test
     void testIsEven_WithOddNumber() {
        NumberUtils utils = new NumberUtils();
        assertFalse(utils.isEven(5), "5 should be odd");
    }
}
