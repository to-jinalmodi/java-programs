package com.xcelerateDesign.javaPrograms.accessModifiers;

/**
 * Private modifier class.
 */
public class PrivateModifier {

    private String privateString;

    public static void main(String[] args) {

        PrivateModifier privateModifier = new PrivateModifier();
        privateModifier.privateString = "Private String";
        System.out.println(privateModifier.privateString);

    }

}
