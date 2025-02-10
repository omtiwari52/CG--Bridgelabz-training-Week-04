package com.capgemini.dynamic_online_marketplace;

public class MarketPlaceUtility {
    public static <T extends Product<?>> void applyDiscount(T product , double percentage){
        double discount = product.getPrice() * (percentage /100);
        product.setPrice(product.getPrice()-discount);
        System.out.println("New price after discount is: " + product.getPrice());
    }
}
