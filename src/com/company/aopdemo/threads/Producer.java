package com.company.aopdemo.threads;

public class Producer extends Thread{

    Company c;

    Producer(Company c) {
        this.c = c;
    }

    public void run() {

        int n = 1;
        for(int i=1; i<10; i++) {
            this.c.produceItem(n);

            try {
                Thread.sleep(4000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            n++;
        }
    }
}
