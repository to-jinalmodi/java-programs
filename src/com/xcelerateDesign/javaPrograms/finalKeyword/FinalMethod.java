package com.xcelerateDesign.javaPrograms.finalKeyword;

/**
 * Final methods: When a method is declared as final, it cannot be overridden by a subclass.
 * This is useful for methods that are part of a class’s public API
 * and should not be modified by subclasses.
 */
class FinalMethod {

    final void finalMethod1() {
        System.out.println("Hello! I am final method 1");
    }

}

class ChildMethod extends FinalMethod {

    /*void finalMethod1() {
        System.out.println("Hello! I am final method 1");
    }*/

}
