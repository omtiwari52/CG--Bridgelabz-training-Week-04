package com.capgemini.smart_warehouse_management_system;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SmartWarehouseManagementSystemTest {

    //define lists
    Storage<Electronics> electronicsStorage;
    Storage<Furniture> furnitureStorage;
    Storage<Groceries> groceriesStorage;

    //initialize lists
    @BeforeEach
    void setUpList(){
        electronicsStorage = new Storage<>();
        furnitureStorage = new Storage<>();
        groceriesStorage = new Storage<>();
    }

    @Test
    void smartWarehouseTest(){

        //store items in each category
        groceriesStorage.addItem(new Groceries("Soyabean oil", 175, "30-02-2099"));
        electronicsStorage.addItem(new Electronics("Laptop", "MSI", 69999));
        furnitureStorage.addItem(new Furniture("Bed", 50000, "Sagon"));

        assertEquals("Soyabean oil",groceriesStorage.getItems().getFirst().getName());
        assertEquals(175, groceriesStorage.getItems().getFirst().getPrice());

        assertEquals("Laptop", electronicsStorage.getItems().getFirst().getName());
        assertEquals(69999,electronicsStorage.getItems().getFirst().getPrice());

        assertEquals("Bed", furnitureStorage.getItems().getFirst().getName());
        assertEquals(50000,furnitureStorage.getItems().getFirst().getPrice());

    }
}
