package com.company.aopdemo.oops;

public class Labrador extends Dog {

    public String color = "Child color";

//    private String specialCapability = "athletic";

//    public void specialCapabilities() {
//        System.out.println("I am an athletic dog");
//    }


    public void childMethod() {
        System.out.println("Method of only child class not override from parent");
    }
}
