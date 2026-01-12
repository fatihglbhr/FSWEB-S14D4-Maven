package org.example.model;

public class Store{

    Chocolate chocolate = new Chocolate("food",2.5,"sugar");
    Bread bread = new Bread("food", 0.25, "gluten");
    Coke coke = new Coke("drink", 1.5, "sparkly");
    public static void main(String[] args) {

        //listProducts();
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product: products)
        product.showDetails();
    }
}