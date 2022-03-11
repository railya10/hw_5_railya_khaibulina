package com.company;

public class Hero {
    private int health;
    private int damage;
    private String superStrength;

    public Hero(int health, int damage, String superStrength) {
        this.health = health;
        this.damage = damage;
        this.superStrength = superStrength;
    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperStrength() {
        return superStrength;
    }
}


