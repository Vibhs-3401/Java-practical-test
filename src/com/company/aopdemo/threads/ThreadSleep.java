package com.company.aopdemo.threads;

public class ThreadSleep extends Thread {

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
                System.out.println(i);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        ThreadSleep threadSleep = new ThreadSleep();
        threadSleep.start();
    }
}
