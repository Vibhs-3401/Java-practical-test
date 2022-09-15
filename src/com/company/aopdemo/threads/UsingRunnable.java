package com.company.aopdemo.threads;

public class UsingRunnable implements Runnable{


    @Override
    public void run() {
        for(int i=1; i<=10; i++) {
            System.out.println("i ni value(runnable): " + i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
