package com.capgemini.smart_warehouse_management_system;

public class Electronics extends WarehouseItem{

    //define attribute name branch which indicates the brand of product
    private String brand;

    //constructor
    Electronics(String name, String brand, double price){
        super(name,price);
        this.brand = brand;
    }

    //method to get brand name
    public String getBrand() {
        return brand;
    }

    //overriding display method from parent class
    @Override
    public void display() {
        System.out.println("Electronic: "+getName() + "\nBrand: "+ getBrand() +"\nPrice: "+getPrice());
    }
}
