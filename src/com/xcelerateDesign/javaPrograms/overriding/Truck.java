package com.xcelerateDesign.javaPrograms.overriding;

class Truck implements Vehicle {

    @Override
    public void name() {
        System.out.println("My name is Truck");
    }

    @Override
    public void door() {
        System.out.println("I have 2 doors");
    }

    @Override
    public void tyre() {
        System.out.println("I have 4 tyres");
    }

}
