package org.example.model;

abstract class ProductForSale {
    private String type;
    private double price;
    private String description;

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    double getSalesPrice(int quantity){
        return quantity*this.price;
    }
    abstract void showDetails();
}
