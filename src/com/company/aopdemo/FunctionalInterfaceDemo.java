package com.company.aopdemo;

@FunctionalInterface
public interface FunctionalInterfaceDemo {

    void singleAbstractMethod();

//    void singleAbstractMethod2();

    default void printName() {
        System.out.println("Welcome to code decode");
    }

    default void printName2() {
        System.out.println("Welcome to code decode2");
    }
}
