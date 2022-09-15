package com.company.aopdemo.oops;

import java.util.function.BiFunction;

public class OopsMain {

    public static void main(String[] args) {

        Dog dog = new Dog();
        System.out.println(dog.color);
        dog.specialCapabilities();

        Labrador labrador = new Labrador();
        System.out.println(labrador.color);
        labrador.specialCapabilities();
        labrador.childMethod();
        labrador.parentMethod();

        Dog dogRef = new Labrador();
        System.out.println(dogRef.color);
        dogRef.specialCapabilities();
        dogRef.parentMethod();

        final HelloDemo helloDemo = new HelloDemo();
        helloDemo.setAge(4);
        helloDemo.setAge(8);
//        helloDemo = new HelloDemo();
        System.out.println(helloDemo.age);
    }
}
