package com.xcelerateDesign.javaPrograms.AnimalInterface;

/**
 * Fox class.
 */
public class Fox implements Animal {

    @Override
    public void food() {
        System.out.println("Fox : Non-Vegetarian");
    }

    @Override
    public void leg() {
        System.out.println("Fox : 4 legs");
    }

    @Override
    public void type() {
        System.out.println("Fox : Wild");
    }

}
