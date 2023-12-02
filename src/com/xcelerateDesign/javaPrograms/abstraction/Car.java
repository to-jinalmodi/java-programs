package com.xcelerateDesign.javaPrograms.abstraction;

/**
 * Car class.
 */
public class Car extends Vehicle {

    @Override
    void tyre() {
        System.out.println("4 tyres");
    }

    @Override
    void brand() {
        System.out.println("Ford");
    }

}
