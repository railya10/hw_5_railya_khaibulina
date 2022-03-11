package com.company;

public class Main {

     public static void main(String[] args) {


         Boss boss1 = new Boss();
         boss1.setDamage(50);
         boss1.setDefenseType("Block");
         boss1.setHealth(500);
         System.out.println("Boss1: " + boss1.getDamage() + " " + boss1.getDefenseType() + " " + boss1.getHealth());

         for (int i = 0; i < createHeroes().length; i++){
             System.out.println(createHeroes()[i].getHealth() + " " + createHeroes()[i].getDamage() + " "
                     + createHeroes()[i].getSuperStrength());
         }
     }

    public static Hero [] createHeroes(){ //*******
    Hero hero1 = new Hero(300, 30, "Magic");
    Hero hero2 = new Hero(250, 35);
    Hero hero3 = new Hero(150, 25, "Freeze");

    Hero[] heroesMassive = {hero1, hero2, hero3};
        return heroesMassive;}

    }





