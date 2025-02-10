package com.capgemini.dynamic_online_marketplace;

abstract class ProductCategory {

    //define attribute
    private String categoryName;

    //constructor
    ProductCategory(String categoryName){
        this.categoryName = categoryName;
    }

    //method to get category name
    public String getCategoryName() {
        return categoryName;
    }
}
