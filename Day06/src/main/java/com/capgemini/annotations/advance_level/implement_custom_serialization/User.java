package com.capgemini.annotations.advance_level.implement_custom_serialization;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class User {
    @JsonField(name = "user_name")
    private String name;

    @JsonField(name = "user_age")
    private int age;

    User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


    public static String serializeToJson(Object obj) throws IllegalAccessException {
        Class<?> clazz = obj.getClass();
        Map<String,Object> map = new HashMap<>();

        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(JsonField.class)){
                field.setAccessible(true);
                JsonField annotation = field.getAnnotation(JsonField.class);
                map.put(annotation.name(),field.get(obj));
            }
        }
        return convertToJsonString(map);
    }

    private static String convertToJsonString(Map<String, Object> jsonMap) {
        StringBuilder jsonString = new StringBuilder("{");
        for (Map.Entry<String, Object> entry : jsonMap.entrySet()) {
            jsonString.append("\"").append(entry.getKey()).append("\": ")
                    .append("\"").append(entry.getValue()).append("\", ");
        }
        if (jsonString.length() > 1) {
            jsonString.setLength(jsonString.length() - 2); // Remove last comma
        }
        jsonString.append("}");
        return jsonString.toString();
    }
}
