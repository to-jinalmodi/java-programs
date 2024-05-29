package com.xcelerateDesign.javaPrograms.objectEqual;

public class Execute {

    public static void main(String[] args) {

        Person p1 = new Person("Bob", 20 );
        Person p2 = new Person("Bob", 20 );

        // This compares object type address
        System.out.println(p1 == p2);

        // This calls equals method of person class
        System.out.println((p1.equals(p2)));

    }

}
