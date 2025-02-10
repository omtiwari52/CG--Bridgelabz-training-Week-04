package com.capgemini.smart_warehouse_management_system;

public class Groceries extends WarehouseItem {

    //define attribute expireDate to get the expiry date of a product
    private String expireDate;

    //constructor
    Groceries(String name, double price, String expireDate){
        super(name, price);
        this.expireDate = expireDate;
    }

    //method to get expire date of a product
    public String getExpireDate() {
        return expireDate;
    }

    //overriding display method from parent class
    @Override
    public void display() {
        System.out.println("Grocery: "+getName() +"\nPrice: "+getPrice() +"\nExpiry Date: "+getExpireDate());
    }
}
