package com.capgemini.annotations.advance_level.custom_caching_system;

import java.util.HashMap;
import java.util.Map;

public class CachedResult {
    private static Map<Integer, Integer> map = new HashMap<>();

    // Method which store the cache
    @CacheResult
    public int computeSquare(int num){
        if (map.containsKey(num)){
            System.out.println("Retrieve the old value of: " + num);
            return map.get(num);
        }

        int square = num*num;
        map.put(num,square);
        return map.get(num);
    }
}
