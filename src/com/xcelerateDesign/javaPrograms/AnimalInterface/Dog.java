package com.xcelerateDesign.javaPrograms.AnimalInterface;

/**
 * Dog class.
 */
public class Dog implements Animal {

    @Override
    public void food() {
        System.out.println("Dog : Non-Vegeterian");
    }

    @Override
    public void leg() {
        System.out.println("Dog : 4 legs");
    }

    @Override
    public void type() {
        System.out.println("Dog : Domestic");
    }

}
