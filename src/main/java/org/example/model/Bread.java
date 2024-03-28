package org.example.model;

public class Bread extends ProductForSale {
    private boolean sourdough;

    public Bread(String type, int price, String description) {
        super(type, price, description);
    }

    public Bread(String type, int price, String description, boolean sourdough) {
        super(type, price, description);
        this.sourdough = sourdough;
    }

    public boolean isSourdough() {
        return sourdough;
    }

    @Override
    public void showDetails() {
        System.out.println("Bread Details:");
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice() + " TL");
        System.out.println("Description: " + getDescription());
        System.out.println("Is It Sourdough: " + (sourdough ? "Yes" : "No"));
    }
}
