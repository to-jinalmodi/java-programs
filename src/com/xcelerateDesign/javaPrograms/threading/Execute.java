package com.xcelerateDesign.javaPrograms.threading;

import java.util.Date;

public class Execute {

    public static void main(String[] args) throws InterruptedException {

        Date startDate = new Date();
        System.out.println("Start Main at: " + startDate);
        System.out.println("---------------------------------------");

        MyThread myThread1 = new MyThread();
        myThread1.start();
        myThread1.setName("myThread1");
        MyThread myThread2 = new MyThread();
        myThread2.start();
        myThread2.setName("myThread2");
        MyThread myThread3 = new MyThread();
        myThread3.start();
        myThread3.setName("myThread3");

        myThread1.join();
        myThread2.join();
        myThread3.join();

        Date endDate = new Date();
        System.out.println("End Main at: " + endDate);
        System.out.println("---------------------------------------");
        System.out.println("Difference: " + ((endDate.getTime()-startDate.getTime())/1000));

    }

}
