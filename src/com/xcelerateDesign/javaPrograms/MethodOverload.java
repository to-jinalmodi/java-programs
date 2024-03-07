package com.xcelerateDesign.javaPrograms;

/**
 * Method Overloading allows different methods to have the same name, but different signatures,
 * where the signature can differ by the number of input parameters or type of input parameters, or a mixture of both.
 * Method overloading in Java is also known as Compile-time Polymorphism, Static Polymorphism, or Early binding.
 */
public class MethodOverload {

    public void sum() {
        System.out.println(5);
    }

    public void sum(int i) {
        System.out.println("int: " + i);
    }

    public void sum(long i) {
        System.out.println("long: " + i);
    }

    public void sum(int i, int j) {
        System.out.println("sum of int i + j: " + (i + j));
    }

    public void sum(float i, float j) {
        System.out.println("sum of float i + j: " + (i + j));
    }

    public void sum(int i, int j, int k) {
        System.out.println("sum of int i + j + k: " + i + j + k);
    }

    public static void main(String[] args) {
        MethodOverload c = new MethodOverload();
        c.sum();
        c.sum(10);
        c.sum(10l);
        c.sum(35,15);
        c.sum(23.8f, 12.9f);
        c.sum(10, 20, 30);
    }

}
