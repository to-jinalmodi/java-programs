package com.xcelerateDesign.javaPrograms.threading;

import java.util.Date;

/**
 * In Java, a thread is a fundamental unit of execution within a program.
 * Threads allow a program to operate more efficiently by performing multiple tasks concurrently.
 */
public class MyThread extends Thread {

    public void run() {

        System.out.println("----->> Start: " + new Date() + " :: Thread name: " + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("----->> End " + new Date() + " :: Thread name: " + Thread.currentThread().getName());

    }

}
