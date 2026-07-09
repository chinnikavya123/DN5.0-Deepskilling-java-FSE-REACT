package com.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Test class for BankAccount using AAA pattern
class BankAccountTest {
    BankAccount account;
    // Setup (runs before each test)
    @BeforeEach
    void setUp() {
        account = new BankAccount(1000); // initial balance
        System.out.println("Setup: Account created with balance 1000");
    }

    // Teardown (runs after each test)
    @AfterEach
    void tearDown() {
        account = null;
        System.out.println("Teardown: Account cleared");
    }

    @Test
    void testDeposit() {

        // Arrange
        double depositAmount = 500;

        // Act
        account.deposit(depositAmount);

        // Assert
        assertEquals(1500, account.getBalance());
    }

    @Test
    void testMultipleDeposits() {

        // Arrange
        double firstDeposit = 200;
        double secondDeposit = 300;

        // Act
        account.deposit(firstDeposit);
        account.deposit(secondDeposit);

        // Assert
        assertEquals(1500, account.getBalance());
    }
}

/*
 * Output:
 * Setup: Account created with balance 1000
 * Teardown: Account cleared
 * Setup: Account created with balance 1000
 * Teardown: Account cleared
 *
 * Tests run: 2
 * Test Passed
 * BUILD SUCCESS
 *
 * Learned:
 * - Used AAA pattern (Arrange, Act, Assert) to structure tests clearly.
 * - Used @BeforeEach for setup before every test.
 * - Used @AfterEach for cleanup after every test.
 * - Improved test readability and organization.
 * - Each test runs independently with fresh data.
 */