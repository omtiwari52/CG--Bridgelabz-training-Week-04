package com.capgemini.dynamic_online_marketplace;

public class Product <T extends ProductCategory>{

    //define attributes
    private String name;
    private double price;
    private T category;

    //constructor
    public Product(String name, double price, T category){
        this.category = category;
        this.name = name;
        this.price = price;
    }

    //method to get name of product
    public String getName() {
        return name;
    }

    //method to get price of product
    public double getPrice() {
        return price;
    }

    //method to get category of product
    public T getCategory() {
        return category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void display(){
        System.out.println("Name: "+name + "\nCategory: "+ category.getCategoryName() + "\nPrice: $"+ price);
        System.out.println("------------------------------------");
    }
}
