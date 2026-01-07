package org.example.model;

public class Coke extends ProductForSale{
    private int litre;
    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public String toString() {
        return "Coke{" +
                "litre=" + litre +
                "type="+ getType() +
                "price=" + getPrice() +
                "description=" + getDescription()+
                '}';
    }

    @Override
    void showDetails() {
        System.out.println();
    }
}
