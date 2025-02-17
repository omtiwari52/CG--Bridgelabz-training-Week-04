package com.capgemini.reflection.advance_problems.dependecy_injection;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class DIContainer {
    private final Map<Class<?>, Object> instances = new HashMap<>();

    public DIContainer() {
        // Register implementations
        instances.put(Service.class, new EmailService());
    }

    public <T> T getInstance(Class<T> clazz) throws Exception {
        T instance = clazz.getDeclaredConstructor().newInstance();

        // Inject dependencies
        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true); // Allow modifying private fields
                Object dependency = instances.get(field.getType());
                if (dependency != null) {
                    field.set(instance, dependency);
                } else {
                    throw new RuntimeException("No implementation found for " + field.getType().getName());
                }
            }
        }
        return instance;
    }
}

