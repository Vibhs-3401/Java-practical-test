package com.company.aopdemo;

public class MethodReferencing {

    public static void main(String[] args) {
        FunctionalInterfaceDemo functionalInterfaceDemo = MethodTest ::testImplementation;
        functionalInterfaceDemo.singleAbstractMethod();

////        if no testImplementation exist in this code then use following lambda code
//        FunctionalInterfaceDemo f = () -> System.out.println("IMPLEMENTATION OF SAM(single abstract method)");
//        f.singleAbstractMethod();
    }
}

class MethodTest {
    public static void testImplementation() {
        System.out.println("This is test implementation of your abstract method");
    }
}
