package com.xcelerateDesign.javaPrograms.abstraction;

/**
 * Execute class vehicle car and truck.
 */
public class Execute {

    public static void main(String[] args) {

        Vehicle car = new Car();
        car.tyre();
        car.brand();
        car.safety();

        Vehicle truck = new Truck();
        truck.tyre();
        truck.brand();
        truck.safety();

    }

}
