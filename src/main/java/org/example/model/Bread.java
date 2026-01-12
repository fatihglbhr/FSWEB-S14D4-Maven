package org.example.model;

public class Bread extends ProductForSale{
    private int gram;
    public Bread(String type, double price, String description) {
        super(type, price, description);
        this.gram = gram;
    }

    @Override
    public void showDetails() {
        System.out.println(gram);
        System.out.println(getType());
        System.out.println(getPrice());
        System.out.println(getDescription());
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
