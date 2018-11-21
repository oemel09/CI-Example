package de.oemel09.ci;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
