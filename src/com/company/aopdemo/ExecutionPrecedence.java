package com.company.aopdemo;

public class ExecutionPrecedence {

    {
        System.out.println("From instance initializer block 2");
    }

    ExecutionPrecedence(int x) {
        System.out.println("From one arg Constructor " + x);
    }

    ExecutionPrecedence() {
        System.out.println("From no arg Constructor");
    }

    {
        System.out.println("From instance initializer block 1");
    }

    static {
        System.out.println("From static block 1");
    }

    {
        System.out.println("From instance initializer block 3");
    }


    static {
        System.out.println("From static block 2");
    }

    public void metho() {
        System.out.println("From instance method");
    }

    public static void main(String[] args) {
        new ExecutionPrecedence().metho();
        System.out.println("---------------------------");
        new ExecutionPrecedence();
        System.out.println("---------------------------");
        ExecutionPrecedence executionPrecedence = new ExecutionPrecedence();
        executionPrecedence.metho();
        System.out.println("---------------------------");
        new ExecutionPrecedence(5);
    }
}
