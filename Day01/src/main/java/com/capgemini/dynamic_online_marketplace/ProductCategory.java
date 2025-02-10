package com.capgemini.dynamic_online_marketplace;

abstract class ProductCategory {

    //define attribute
    private String categoryName;

    ProductCategory(String categoryName){
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }
}
