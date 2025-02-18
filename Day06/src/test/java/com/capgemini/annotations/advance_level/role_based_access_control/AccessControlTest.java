package com.capgemini.annotations.advance_level.role_based_access_control;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class AccessControlTest {

    @Test
    void testAdminAccessAllowed() {
        User adminUser = new User("Admin");

        // Capture console output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        AccessControl.invokeClass(AdminService.class, adminUser);

        String output = outputStream.toString().trim();
        assertTrue(output.contains("Access Granted!"));
        assertTrue(output.contains("Admin Task performed successfully"));

        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
    }

    @Test
    void testUserAccessDenied() {
        User normalUser = new User("User");

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        AccessControl.invokeClass(AdminService.class, normalUser);

        String output = outputStream.toString().trim();
        assertTrue(output.contains("Access Denied!"));

        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
    }
}
