package com.xcelerateDesign.javaPrograms.abstraction;

/**
 * Abstract Vehicle class.
 */
public abstract class Vehicle {

    abstract void tyre();
    abstract void brand();

    void safety() {
        System.out.println("safety");
    }

}
