package com.company.aopdemo.threads;

public class VariableAmount extends Thread{
    public static int amount = 0;

    public static void main(String[] args) {
        VariableAmount thread = new VariableAmount();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }

    public void run() {
        amount++;
    }
}
