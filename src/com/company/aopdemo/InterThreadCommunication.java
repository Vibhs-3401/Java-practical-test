package com.company.aopdemo;

public class InterThreadCommunication {
    int amount = 10000;

    synchronized void withdraw(int amount) {

        System.out.println("Going to withdraw...!");

        if (this.amount < amount) {
            System.out.println("Less balance, waiting for deposit...");
            try {
                wait();
            } catch (Exception e) {}
        }

        this.amount -= amount;
        System.out.println("withdraw completed...!");
    }

    synchronized void deposit(int amount) {
        System.out.println("going to deposit...<3");

        this.amount += amount;
        System.out.println("Deposit completed...!");
        notify();
    }
}

class Test {

    public static void main(String[] args) {
        final InterThreadCommunication communication = new InterThreadCommunication();

        new Thread() {public void run() {communication.withdraw(15000);}}.start();
        new Thread() {public void run() {communication.deposit(10000);}}.start();
    }
}
