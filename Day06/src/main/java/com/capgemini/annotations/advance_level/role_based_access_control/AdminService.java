package com.capgemini.annotations.advance_level.role_based_access_control;

@RoleAllowed("Admin")
public class AdminService {

    public void performAdminTask(){
        System.out.println("Admin Task performed successfully");
    }
}
