package com.capgemini.annotations.advance_level.role_based_access_control;

public class Main {
    public static void main(String[] args) {
        User adminUser = new User("Admin");

        User normalUser = new User("User");

        System.out.print("Trying to access as Admin :");
        AccessControl.invokeClass(AdminService.class,adminUser);

        System.out.println();

        System.out.print("Trying to access as User : ");
        AccessControl.invokeClass(AdminService.class,normalUser);

    }
}
