package com.exampl.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayEqualTest {

    @Test
    public void testIntArrayEquality() {
        ArrayEquals utils = new ArrayEquals();
        int[] expected = {1, 2, 3, 4, 5};
        int[] actual = utils.getNumbers();

        // Check if both arrays are equal
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testStringArrayEquality() {
        ArrayEquals utils = new ArrayEquals();
        String[] expected = {"Alice", "Bob", "Charlie"};
        String[] actual = utils.getNames();

        // Check if both string arrays are equal
        assertArrayEquals(expected, actual);
    }
}
