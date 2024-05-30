package com.xcelerateDesign.javaPrograms.objectEqual;

/**
 * Person having properties name, age and city
 */
public class Person {

    private String name;
    private int age;
    private String city;

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
        this.city = ""; // Setting up empty city

    }

    @Override
    public String toString() {

        return this.name + " " + this.age;

    }

    @Override
    public boolean equals(Object obj) {

        Person otherObj = (Person) obj;
        return this.name.equals(otherObj.name) && this.age == otherObj.age;

    }

}
