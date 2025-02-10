package com.capgemini.smart_warehouse_management_system;

public class Furniture extends WarehouseItem{

    //define attributes
    private String material;

    //constructor
    Furniture(String name, double price, String material){
        super(name, price);
        this.material = material;
    }

    //method to get material name
    public String getMaterial() {
        return material;
    }

    //overriding display method from parent class
    @Override
    public void display() {
        System.out.println("Furniture: "+getName()+ "\nFurniture Material: "+ getMaterial()+"\nPrice: "+getPrice());
    }
}
