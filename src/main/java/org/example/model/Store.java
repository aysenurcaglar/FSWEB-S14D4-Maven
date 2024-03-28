package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("Truffle", 5,
                "Delicious truffle", "Ferrero Rocher");
        products[1] = new Coke("Cherry Coke", 2,
                "Refreshing cola drink", 330);
        products[2] = new Bread("Whole Wheat Bread", 1,
                "Freshly baked bread", true);

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }
}