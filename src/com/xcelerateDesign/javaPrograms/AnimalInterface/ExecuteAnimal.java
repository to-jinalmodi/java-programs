package com.xcelerateDesign.javaPrograms.AnimalInterface;

import java.util.Scanner;

/**
 * Execute Animal class.
 */
public class ExecuteAnimal {

    public static void main(String[] args) {

        System.out.println("Choose Any Animal ( Dog / Elephant / Fox / Goat / Lion ) : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        Animal a = null;
        switch (input) {
            case "Dog" -> a = new Dog();
            case "Elephant" -> a = new Elephant();
            case "Fox" -> a = new Fox();
            case "Goat" -> a = new Goat();
            case "Lion" -> a = new Lion();
            default -> System.out.println("Invalid input");
        }

        if (a != null) {
            a.food();
            a.leg();
            a.type();
        }

    }

}
