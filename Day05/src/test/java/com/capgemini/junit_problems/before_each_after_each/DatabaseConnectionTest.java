package com.capgemini.junit_problems.before_each_after_each;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DatabaseConnectionTest {
    private DatabaseConnection dbConnection;

    @BeforeEach
    void setUp() {
        dbConnection = new DatabaseConnection();
        dbConnection.connect();
        assertTrue(dbConnection.isConnected());
    }

    @Test
    void testConnectionEstablished() {
        assertTrue(dbConnection.isConnected());
        System.out.println("✅ Test1 Passed");
    }

    @Test
    void testDisconnect() {
        dbConnection.disconnect();
        assertFalse(dbConnection.isConnected());
        System.out.println("✅ Test2 Passed");
    }

    @AfterEach
    void tearDown() {
        dbConnection.disconnect();
        assertFalse(dbConnection.isConnected());
        System.out.println("✅ Test3 Passed After each test");
    }
}
