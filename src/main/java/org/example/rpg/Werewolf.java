package org.example.rpg;

public class Werewolf extends Monster implements Bleedable, Poisonable {
    private boolean swearwolf;

    public Werewolf(String name, int hitPoints, double damage, boolean swearwolf) {
        super(name, hitPoints, damage);
        this.swearwolf = swearwolf;
    }

    public boolean isSwearwolf() {
        return swearwolf;
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
        System.out.println("Does it swear?: " +
                (swearwolf ? "Of course! They're all a bunch of Swearwolves!"
                        :
                        "They're Werewolves, not Swearwolves!"));
        System.out.println("*************");
    }

    @Override
    public double bleed() {
        return getDamage() * 0.35;
    }

    @Override
    public double poison() {
        return getDamage() * 0.5;
    }
}
