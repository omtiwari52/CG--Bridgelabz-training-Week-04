package com.capgemini.annotations.advance_level.custom_caching_system;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CheckCustomCachingTest {
    @Test
    void computeSquare(){
        CachedResult cache = new CachedResult();
        cache.computeSquare(2);
        cache.computeSquare(4);
        cache.computeSquare(4);

        assertEquals(4,cache.computeSquare(2));
    }
}
