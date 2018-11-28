package de.oemel09.ci;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    static void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testSum() {
        assertEquals(4, calculator.sum(2, 2));
        assertEquals(8, calculator.sum(4, 4));
    }

    @Test
    void testMultiply() {
        assertEquals(4, calculator.multiply(2, 2));
        assertEquals(12, calculator.multiply(3, 4));
    }

    @Test
    void testSubtract() {
        assertEquals(2, calculator.subtract(4, 2));
        assertEquals(2, calculator.subtract(8, 6));
    }

    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(8, 4));
        assertEquals(8, calculator.divide(16, 2));
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(8, 0));
    }

    @Test
    void testPow() {
        assertEquals(8, calculator.pow(2, 3));
    }

    @Test
    void testPowWithExponent1() {
        assertEquals(2, calculator.pow(2, 1));
    }

    @Test
    void testPowWithExponent0() {
        assertEquals(1, calculator.pow(2, 0));
    }

    @Test
    void testSquare() {
        assertEquals(4, calculator.square(2));
        assertEquals(16, calculator.square(4));
    }
}
