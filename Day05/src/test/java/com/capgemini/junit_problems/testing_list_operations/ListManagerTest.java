package com.capgemini.junit_problems.testing_list_operations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ListManagerTest {

    private ListManager listManager;
    private List<Integer> list;

    @BeforeEach
    void setUp() {
        listManager = new ListManager();
        list = new ArrayList<>();
    }

    @Test
    void testAddElement() {
        listManager.addElement(list, 10);
        assertTrue(list.contains(10));
        System.out.println("✅Test1 Passed");
    }

    @Test
    void testRemoveElement() {
        listManager.addElement(list, 20);
        assertTrue(listManager.removeElement(list, 20));
        assertFalse(list.contains(20));
        System.out.println("✅Test2 Passed");
    }

    @Test
    void testRemoveElement_NotPresent() {
        assertFalse(listManager.removeElement(list, 30));
        System.out.println("✅Test3 Passed");
    }

    @Test
    void testGetSize() {
        listManager.addElement(list, 5);
        listManager.addElement(list, 15);
        assertEquals(2, listManager.getSize(list));
        System.out.println("✅Test4 Passed");
    }
}
