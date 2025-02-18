package com.capgemini.annotations.intermediate.max_length_annotation;

import java.lang.reflect.Field;

public class User {
    @MaxLength(10)
    private String userName;

    User(String userName){
        validateMaxLength(this,userName);
        this.userName = userName;
    }
    // Validate the length
    private void validateMaxLength(Object obj, String value){
        try{
            Field field = obj.getClass().getDeclaredField("userName");
            MaxLength maxLength = field.getAnnotation(MaxLength.class);

            if (maxLength.value() < value.length()){
                throw new IllegalArgumentException("Exception caught");
            }

        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    public String getUserName() {
        return userName;
    }

}
