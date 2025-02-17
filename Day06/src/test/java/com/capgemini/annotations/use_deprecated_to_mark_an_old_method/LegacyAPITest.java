package com.capgemini.annotations.use_deprecated_to_mark_an_old_method;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LegacyAPITest {

    @Test
    void testNewFeature() {
        LegacyAPI api = new LegacyAPI();
        assertDoesNotThrow(api::newFeature);
        System.out.println("✅ Test1 Passed");
    }

    @SuppressWarnings("deprecation") // Suppress warning for testing old method
    @Test
    void testOldFeature() {
        LegacyAPI api = new LegacyAPI();
        assertDoesNotThrow(api::oldFeature);
        System.out.println("✅ Test2 Passed");
    }
}