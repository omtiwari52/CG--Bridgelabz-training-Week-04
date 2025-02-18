package com.capgemini.reflection.advance_problems.custom_object_mapper;

import java.lang.reflect.Field;
import java.util.Map;

public class ObjectMapper {

    public <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        T obj = createInstance(clazz);
        setProperties(obj, properties);
        return obj;
    }

    private <T> T createInstance(Class<T> clazz) {
        try {
            return clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private <T> void setProperties(T obj, Map<String, Object> properties) {
        for (Map.Entry<String, Object> entry : properties.entrySet()) {
            String fieldName = entry.getKey();
            Object value = entry.getValue();

            try {
                Field field = obj.getClass().getDeclaredField(fieldName);
                field.setAccessible(true);
                field.set(obj, value);
            } catch (NoSuchFieldException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }
}