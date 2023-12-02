package com.xcelerateDesign.javaPrograms.AnimalInterface;

/**
 * Elephant class.
 */
public class Elephant implements Animal {

    @Override
    public void food() {
        System.out.println("Elephant : Vegeterian");
    }

    @Override
    public void leg() {
        System.out.println("Elephant : 4 legs");
    }

    @Override
    public void type() {
        System.out.println("Elephant : wild");
    }

}
