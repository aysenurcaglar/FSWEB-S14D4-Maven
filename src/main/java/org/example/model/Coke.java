package org.example.model;

public class Coke extends ProductForSale {
    private int amount;

    public Coke(String type, int price, String description) {
        super(type, price, description);
    }

    public Coke(String type, int price, String description, int amount) {
        super(type, price, description);
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public void showDetails() {
        System.out.println("Coke Details:");
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice() + " TL");
        System.out.println("Description: " + getDescription());
        System.out.println("Amount: " + getAmount() + " ml");
    }
}
