package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Test class for Assertions
class AssertionsTest {

    @Test
    void testAssertions() {

        // Assert equals
        assertEquals(5, 2 + 3);

        // Assert true
        assertTrue(5 > 3);

        // Assert false
        assertFalse(5 < 3);

        // Assert null
        assertNull(null);

        // Assert not null
        assertNotNull(new Object());
    }
}

/*
 * Output:
 * Tests run: 1
 * Test Passed
 * BUILD SUCCESS
 *
 * Learned:
 * - Used JUnit 5 @Test annotation to create test methods.
 * - Used assertEquals() to compare expected and actual values.
 * - Used assertTrue() to verify conditions are true.
 * - Used assertFalse() to verify conditions are false.
 * - Used assertNull() to check if value is null.
 * - Used assertNotNull() to check if object is created properly.
 * - Learned how different JUnit assertions help validate code behavior.
 */