package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    void testExternalApi() {

        // Create a mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Return "Mock Data" when getData() is called
        when(mockApi.getData()).thenReturn("Mock Data");

        // Pass the mock object to the service
        MyService service = new MyService(mockApi);

        // Call the service method
        String result = service.fetchData();

        // Check the expected result
        assertEquals("Mock Data", result);

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
 * - Created a mock object using Mockito.
 * - Used when().thenReturn() to define mock behavior.
 * - Tested the service without calling the real API.
 * - Used assertEquals() to verify the result.
 */