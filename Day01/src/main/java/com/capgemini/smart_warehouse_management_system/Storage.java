package com.capgemini.smart_warehouse_management_system;

import java.util.*;

//generic storage class
public class Storage<T extends WarehouseItem> {

    //define attribute and create a list of items
    private List<T> items;

    //constructor
    Storage(){
        this.items = new ArrayList<>();
    }

    //method to add items in a list
    public void addItem(T item){
        items.add(item);
    }

    //method to retrieve items from list
    public List<T> getItems() {
        return items;
    }
}

