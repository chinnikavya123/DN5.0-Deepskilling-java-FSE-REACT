package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Test class for Calculator
class CalculatorTest {

    // Test the add() method
    @Test
    void testAddition() {

        // Create Calculator object
        Calculator c = new Calculator();

        // Check if the result is correct
        assertEquals(5, c.add(2, 3));
    }

    @Test
    void testMultiplication() {
        // Create Calculator object
        Calculator c = new Calculator();
        // Check if the result is correct
        assertEquals(6, c.multiply(2, 3));
    }
}

/*
 * Output:
 * Tests run: 1
 * Test Passed
 * BUILD SUCCESS
 *
 * Learned:
 * - Used @Test to create a test case.
 * - Used assertEquals() to compare expected and actual values.
 * - A green check mark means the test passed.
 */