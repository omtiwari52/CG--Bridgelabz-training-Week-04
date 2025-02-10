package com.capgemini.dynamic_online_marketplace_test;

import com.capgemini.dynamic_online_marketplace.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DynamicOnlineMarketingTest {

    BookCategory bookCategory = new BookCategory();
    ClothingCategory clothingCategory = new ClothingCategory();
    GadgetsCategory gadgetsCategory = new GadgetsCategory();

    //create product object
    Product<BookCategory> book1 = new Product<>("Let Us C", 800, bookCategory);

    Product<ClothingCategory> shirt = new Product<>("T-shirt", 900, clothingCategory);

    Product<GadgetsCategory> phone = new Product<>("Apple", 54999, gadgetsCategory);

    //create a separate catalog
    ProductCatalog<BookCategory> bookCatalog = new ProductCatalog<>();
    ProductCatalog<ClothingCategory> clothCatalog = new ProductCatalog<>();
    ProductCatalog<GadgetsCategory> gadgetCatalog = new ProductCatalog<>();


    @Test
    void dynamicMarketPlaceTest(){
        bookCatalog.addProduct(book1);
        clothCatalog.addProduct(shirt);
        gadgetCatalog.addProduct(phone);
        assertEquals("Let Us C", book1.getName());
        assertEquals("T-shirt", shirt.getName());
        assertEquals("Apple", phone.getName());
    }
}
