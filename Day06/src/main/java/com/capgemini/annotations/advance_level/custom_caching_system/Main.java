package com.capgemini.annotations.advance_level.custom_caching_system;

public class Main {
    public static void main(String[] args) {
        CachedResult cache = new CachedResult();

        System.out.println(cache.computeSquare(2));
        System.out.println(cache.computeSquare(4));
        System.out.println(cache.computeSquare(4));
    }
}
