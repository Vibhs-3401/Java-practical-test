package com.company.aopdemo;

import java.util.HashMap;

public class Hello {
    String title;
    int value;
    public Hello() {
        title += "World";
    }
    public Hello(int value) {
        this.value = value;
        title = "Hello";
        new Hello();
    }

    public static void main(String[] args) {
        Hello c = new Hello(5);
        System.out.println(c.title);
        System.out.println(c.value);

        String str1 = "abcd";
        String str2 = "aadd";

        System.out.println(str1.compareTo(str2));


    }

}
