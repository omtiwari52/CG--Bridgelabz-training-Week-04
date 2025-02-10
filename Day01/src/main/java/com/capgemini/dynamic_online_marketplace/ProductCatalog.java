package com.capgemini.dynamic_online_marketplace;

import java.util.ArrayList;
import java.util.List;

// Generic product catalog
public class ProductCatalog<T extends ProductCategory> {
    List<Product<T>> products = new ArrayList<>();

    public void addProduct(Product<T> product) {
        products.add(product);
    }

    public List<Product<T>> getProducts() {
        return products;
    }

    public void displayCatalog() {
        for (Product<T> product : products) {
            product.display();
        }
    }
}
