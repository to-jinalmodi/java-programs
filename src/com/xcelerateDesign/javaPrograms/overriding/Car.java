package com.xcelerateDesign.javaPrograms.overriding;

class Car implements Vehicle {

    @Override
    public void name() {
        System.out.println("My name is car");
    }
    @Override
    public void door() {
        System.out.println("I have 4 doors");
    }

    @Override
    public void tyre() {
        System.out.println("I have 2 tyres");
    }

}
