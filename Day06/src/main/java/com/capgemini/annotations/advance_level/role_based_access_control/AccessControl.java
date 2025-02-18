package com.capgemini.annotations.advance_level.role_based_access_control;

import java.lang.reflect.InvocationTargetException;

public class AccessControl {

    public static void invokeClass(Class<?> cls, User user){
        if(cls.isAnnotationPresent(RoleAllowed.class)){
            RoleAllowed roleAllowed = cls.getAnnotation(RoleAllowed.class);

            if(roleAllowed.value().equals(user.getRole())){
                try {
                    Object instance = cls.getDeclaredConstructor().newInstance();
                    System.out.println("Access Granted!");
                    ((AdminService) instance).performAdminTask();
                } catch (InvocationTargetException | IllegalAccessException | NoSuchMethodException |
                         InstantiationException e) {
                    System.out.println("Exception caught: "+ e.getMessage());
                }
            }else{
                System.out.println("Access Denied! user role '" + user.getRole() + "'is not allowed");
            }
        }else{
            System.out.println("No role restrictions found");
        }
    }
}
