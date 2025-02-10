package com.capgemini.dynamic_online_marketplace;

public class Main {
    public static void main(String[] args) {
        BookCategory bookCategory = new BookCategory();
        ClothingCategory clothingCategory = new ClothingCategory();
        GadgetsCategory gadgetsCategory = new GadgetsCategory();

        //create product object
        Product<BookCategory> book1 = new Product<>("Let Us C", 800, bookCategory);
        Product<BookCategory> book2 = new Product<>("Death: An Inside Story", 300, bookCategory);

        Product<ClothingCategory> shirt = new Product<>("T-shirt", 900, clothingCategory);
        Product<ClothingCategory> jeans = new Product<>("Cargo", 1800, clothingCategory);

        Product<GadgetsCategory> phone = new Product<>("Apple", 54999, gadgetsCategory);
        Product<GadgetsCategory> tablet = new Product<>("Samsung", 99000, gadgetsCategory);

        //create a separate catalog
        ProductCatalog<BookCategory> bookCatalog = new ProductCatalog<>();
        ProductCatalog<ClothingCategory> clothCatalog = new ProductCatalog<>();
        ProductCatalog<GadgetsCategory> gadgetCatalog = new ProductCatalog<>();

        bookCatalog.addProduct(book1);
        bookCatalog.addProduct(book2);

        clothCatalog.addProduct(shirt);
        clothCatalog.addProduct(jeans);

        gadgetCatalog.addProduct(phone);
        gadgetCatalog.addProduct(tablet);

        System.out.println("--------Book catalog-------");
        bookCatalog.displayCatalog();

        System.out.println("--------Cloth catalog-------");
        clothCatalog.displayCatalog();

        System.out.println("--------Gadget catalog-------");
        gadgetCatalog.displayCatalog();
    }
}
