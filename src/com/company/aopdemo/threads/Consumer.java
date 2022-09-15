package com.company.aopdemo.threads;

public class Consumer extends Thread{

    Company c;

    Consumer(Company c) {
        this.c = c;
    }

    public void run() {

        for(int i=1; i<10; i++) {
            this.c.consumeItem();

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
