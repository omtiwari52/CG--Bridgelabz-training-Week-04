package com.capgemini.smart_warehouse_management_system;

public class Main {
    public static void main(String[] args) {

        //create an object of class
        Storage<WarehouseItem> electronicStorage = new Storage<>();
        Storage<WarehouseItem> groceryStorage = new Storage<>();
        Storage<WarehouseItem> furnitureStorage = new Storage<>();

        //add electronic items to electronic storage
        electronicStorage.addItem(new Electronics("Laptop", "MSI", 69999));
        electronicStorage.addItem(new Electronics("Tablet", "Apple", 29999));

        //add furniture items to furniture storage
        furnitureStorage.addItem(new Furniture("Bed", 50000, "Sagon"));
        furnitureStorage.addItem(new Furniture("Dressing Table", 35000, "Sagon"));

        //add grocery items to grocery storage
        groceryStorage.addItem(new Groceries("Soyabean oil", 175, "30-02-2099"));
        groceryStorage.addItem(new Groceries("Bread", 32, "15-02-2025"));


        System.out.println("---------------------------------------");

        //print all the available items in electronics store
        System.out.println("Electronics present in warehouse are: ");
        WareHouseUtility.displayItems(electronicStorage.getItems());

        System.out.println("---------------------------------------");

        //print all the available items in furniture store
        System.out.println("Furniture present in warehouse are: ");
        WareHouseUtility.displayItems(furnitureStorage.getItems());

        System.out.println("---------------------------------------");

        //print all the available items in grocery store
        System.out.println("Grocery present in warehouse are: ");
        WareHouseUtility.displayItems(groceryStorage.getItems());
    }
}
