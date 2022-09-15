/*
* SINGLETONE CLASS:
* - can have only one instance
* - provide global access to that instance by :
* - declaring all constructors of that class as private
* - providing a static method that returns a reference to the instance
* - the lazy initialization is stored as a private static variable
* - E.G: runtime class, Action servlet, service locator
* - singleton class does not destroy with the completion of the application. while normal class does*/

package com.company.aopdemo;

public class SingletonExample {

    private static SingletonExample singletonInstance = null;

    public String s;
    private SingletonExample() {
        s = "String part of singleton class";
    }

    public static SingletonExample getInstance() {
        if(singletonInstance == null) {
            singletonInstance = new SingletonExample();
        }
        return singletonInstance;
    }
}


class Singleton {
    public static void main(String[] args) {
        SingletonExample s1 = SingletonExample.getInstance();

        SingletonExample s2 = SingletonExample.getInstance();

        SingletonExample s3 = SingletonExample.getInstance();

        System.out.println("Hashcode of s1 is: " + s1.hashCode());
        System.out.println("Hashcode of s2 is: " + s2.hashCode());
        System.out.println("Hashcode of s3 is: " + s3.hashCode());

        if(s1 == s2 && s2 == s3) {
            System.out.println("Three object point to the same memory location on the heap, ie: to the same object");
        }
        else {
            System.out.println("Three objects DO NOT point the same memory location on the heap...!");
        }
    }
}