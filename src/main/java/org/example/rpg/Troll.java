package org.example.rpg;

public class Troll extends Monster implements Bleedable, Poisonable {
    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed() {
        return getDamage() * 0.25;
    }

    @Override
    public double poison() {
        return getDamage() * 0.3;
    }

    @Override
    public double attack() {
        return getDamage() + bleed() + poison();
    }

    @Override
    public void showDetails() {
        System.out.println("Monster Type: " + getClass().getSimpleName());
        System.out.println("Name: " + getName());
        System.out.println("Hit Points: " + getHitPoints());
        System.out.println("Damage: " + getDamage());
        System.out.println("Attack: " + attack());
        System.out.println("*************");
    }
}
