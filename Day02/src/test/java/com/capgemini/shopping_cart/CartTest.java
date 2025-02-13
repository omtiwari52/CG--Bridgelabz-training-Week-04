package com.capgemini.shopping_cart;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartTest {
    ShoppingCart cart = new ShoppingCart();

    @Test
    void cartAdd(){
        // Adding products and prices
        cart.addProduct("Apple", 10);
        cart.addProduct("Banana", 20);
        cart.addProduct("Orange", 40);

        // Adding items to cart
        cart.addToCart("Apple", 20);
        cart.addToCart("Banana", 50);
        cart.addToCart("Orange", 30);

        // Getting the product quantity from the cart
        assertEquals(20,cart.cart.get("Apple"));

        // Checks the product price
        assertEquals(10,cart.productPrices.get("Apple"));

    }
}
