package com.capgemini.smart_warehouse_management_system;

import java.util.List;

public class WareHouseUtility {

    //method to display all the available items in a warehouse
    public static void displayItems(List<? extends WarehouseItem> items){
        for (WarehouseItem item : items){
            item.display();
        }
    }
}
