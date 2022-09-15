package com.company.aopdemo.oops;

interface SampleIface {

    String name = "Vibhuti";

    void sayHello();

    default void sayGoodbye() {
        System.out.println("goodBye");
    }

    static void printing() {
        System.out.println("Printing form static");
    }
}
