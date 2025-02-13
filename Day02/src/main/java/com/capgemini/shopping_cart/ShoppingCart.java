package com.capgemini.shopping_cart;

import java.util.*;

public class ShoppingCart {
    public Map<String, Double> productPrices = new HashMap<>();
    public Map<String, Integer> cart = new LinkedHashMap<>();

    public void addProduct(String product, double price) {
        productPrices.put(product, price);
    }

    // Add product to cart
    public void addToCart(String product, int quantity) {
        if (productPrices.containsKey(product)) {
            cart.put(product, cart.getOrDefault(product, 0) + quantity);
        } else {
            System.out.println("Product not found!");
        }
    }

    // Display cart items in the order they were added
    public void displayCart() {
        System.out.println("Shopping Cart:");
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            String product = entry.getKey();
            int quantity = entry.getValue();
            double price = productPrices.get(product);
            System.out.println(product + " - Quantity: " + quantity + " - Price: " + price);
        }
    }

    // Display items sorted by price
    public void displaySortedByPrice() {
        TreeMap<Double, String> sortedByPrice = new TreeMap<>();
        for (String product : cart.keySet()) {
            sortedByPrice.put(productPrices.get(product), product);
        }

        System.out.println("Items Sorted by Price:");
        for (Map.Entry<Double, String> entry : sortedByPrice.entrySet()) {
            System.out.println(entry.getValue() + " - Price: " + entry.getKey());
        }
    }


}
