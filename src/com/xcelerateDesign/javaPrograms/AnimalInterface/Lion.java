package com.xcelerateDesign.javaPrograms.AnimalInterface;

/**
 * Lion class.
 */
public class Lion implements Animal {

    @Override
    public void food() {
        System.out.println("Lion : Non-Vegetarian");
    }

    @Override
    public void leg() {
        System.out.println("Lion : 4 legs");
    }

    @Override
    public void type() {
        System.out.println("Lion : Wild");
    }

}
