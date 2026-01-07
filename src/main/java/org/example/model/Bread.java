package org.example.model;

public class Bread extends ProductForSale{
    private int gram;
    public Bread(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public String toString() {
        return "Bread{" +
                "gram=" + gram +
                "type="+ getType() +
                "price=" + getPrice() +
                "description=" + getDescription()+
                '}';
    }
}
