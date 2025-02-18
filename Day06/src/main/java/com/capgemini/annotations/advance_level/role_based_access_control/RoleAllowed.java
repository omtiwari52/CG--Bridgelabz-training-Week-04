package com.capgemini.annotations.advance_level.role_based_access_control;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)  //available at runtime
@Target(ElementType.TYPE)   //applicable to only class
public @interface RoleAllowed {
    String value();  //role required to access the class
}
