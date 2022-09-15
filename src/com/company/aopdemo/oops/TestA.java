package com.company.aopdemo.oops;

class TestB {
    public void start() {
        System.out.println("Test B");
    }
}

public class TestA extends TestB{
    public void start() {
        System.out.println("Test A");
    }
    public static void main (String[] args) {
        ((TestB)new TestA()).start();
    }
}
