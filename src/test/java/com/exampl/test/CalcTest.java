package com.exampl.test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalcTest {

    Calc calculator = new Calc();

    @Test
    void testAddition() {
        assertEquals(8, calculator.add(5, 3), "5 + 3 should be 8");
    }

    @Test
    void testSubtraction() {
        assertEquals(2, calculator.subtract(5, 3), "5 - 3 should be 2");
    }

    @Test
    void testMultiplication() {
        assertEquals(15, calculator.multiply(5, 3), "5 * 3 should be 15");
    }

    @Test
    void testDivision() {
        assertEquals(2, calculator.divide(10, 5), "10 / 5 should be 2");
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0),
                "Division by zero should throw ArithmeticException");
    }
}
