package com.xcelerateDesign.javaPrograms.AnimalInterface;

/**
 * Goat class.
 */
public class Goat implements Animal{

    @Override
    public void food() {
        System.out.println("Goat : Vegetarian");
    }

    @Override
    public void leg() {
        System.out.println("Goat : 4 legs");
    }

    @Override
    public void type() {
        System.out.println("Goat : Domestic");
    }

}
