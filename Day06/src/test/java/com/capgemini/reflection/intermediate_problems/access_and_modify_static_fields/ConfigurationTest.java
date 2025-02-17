package com.capgemini.reflection.intermediate_problems.access_and_modify_static_fields;

import org.junit.jupiter.api.Test;
import java.lang.reflect.Field;
import static org.junit.jupiter.api.Assertions.*;

public class ConfigurationTest {

    @Test
    void testModifyAPIKey() throws Exception {
        // Get the class object
        Class<?> configClass = Configuration.class;

        // Access the private static field
        Field apiKeyField = configClass.getDeclaredField("API_KEY");

        // Make it accessible
        apiKeyField.setAccessible(true);

        // Modify its value
        apiKeyField.set(null, "TEST_KEY");

        // Retrieve the modified value
        String modifiedValue = (String) apiKeyField.get(null);

        // Verify the modification
        assertEquals("TEST_KEY", modifiedValue, "API_KEY was not modified correctly!");
    }
}
