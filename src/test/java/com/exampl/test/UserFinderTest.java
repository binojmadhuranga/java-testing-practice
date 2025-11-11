package com.exampl.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class UserFinderTest {
    UserFinder finder = new UserFinder();

    @Test
    void testFindUserById_ReturnsNull() {
        String result = finder.findUserById(0);
        assertNull(result, "Result should be null when ID is 0");
    }

    @Test
    void testFindUserById_ReturnsNotNull() {
        String result = finder.findUserById(5);
        assertNotNull(result, "Result should not be null for valid ID");
    }
}
