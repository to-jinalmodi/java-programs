package com.xcelerateDesign.javaPrograms.overriding;

import java.util.Scanner;

/**
 * If subclass (child class) has the same method as declared in the parent class,
 * it is known as method overriding in Java.
 */
class Execute {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to make ? 'Car' or 'Truck'");
        System.out.print("Input vehicle name: ");
        String vehicleName = scanner.next();

        Vehicle vehicle = null;
        if ("Car".equals(vehicleName)) {
            vehicle = new Car();
        } else if ("Truck".equals(vehicleName)) {
            vehicle = new Truck();
        }

        if (vehicle != null) {
            vehicle.name();
            vehicle.door();
            vehicle.tyre();
        } else {
            System.out.print("There is no vehicle we make on name: " + vehicleName);
        }

    }

}
