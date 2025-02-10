package com.capgemini.smart_warehouse_management_system;

abstract class WarehouseItem {

    //define attributes name and price which can be accessed by every class which extends this class
    private String name;
    private double price;

    //constructor
    WarehouseItem(String name , double price){
        this.name = name;
        this.price =price;
    }

    //get method to get name of product
    public String getName() {
        return name;
    }

    //get method to get price of product
    public double getPrice() {
        return price;
    }

    //abstract display method which can be override by other sub classes
    public abstract void display();
}
