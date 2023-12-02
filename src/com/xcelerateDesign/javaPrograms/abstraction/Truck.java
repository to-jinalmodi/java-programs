package com.xcelerateDesign.javaPrograms.abstraction;

/**
 * Truck class.
 */
public class Truck extends Vehicle {

    @Override
    void tyre() {
        System.out.println("6 tyres");
    }

    @Override
    void brand() {
        System.out.println("RAM");
    }

}
