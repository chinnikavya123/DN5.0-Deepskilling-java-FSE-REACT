package com.example;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class MyServiceVerifyTest {

    @Test
    void testVerifyInteraction() {

        // Create a mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Pass the mock object to the service
        MyService service = new MyService(mockApi);

        // Call the service method
        service.fetchData();

        // Verify that getData() was called
        verify(mockApi).getData();

    }

}

/*
 * Output:
 * Tests run: 1
 * Failures: 0
 * Errors: 0
 * BUILD SUCCESS
 *
 * Learned:
 * - Used verify() to check method calls.
 * - Verified that getData() was called.
 * - Mockito can verify interactions with mock objects.
 */
