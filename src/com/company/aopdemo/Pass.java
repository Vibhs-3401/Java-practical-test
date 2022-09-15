package com.company.aopdemo;

public class Pass {
    public static void main(String[] args) {
        int x = 5;
        Pass pass = new Pass();
        pass.doStuff(x);
        System.out.println("main x = " + x);
    }

    void doStuff(int x) {
        System.out.println("Do stuff x = " + x++);
    }
}
