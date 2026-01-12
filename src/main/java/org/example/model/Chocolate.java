package org.example.model;

public class Chocolate extends ProductForSale{
    private int gram;
    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(getType());
        System.out.println(getPrice());
        System.out.println(getDescription());
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "gram=" + gram +
                "type="+ getType() +
                "price=" + getPrice() +
                "description=" + getDescription()+
                '}';
    }
}
