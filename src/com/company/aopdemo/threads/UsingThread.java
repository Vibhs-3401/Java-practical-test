package com.company.aopdemo.threads;

public class UsingThread extends Thread{

    public void run () {
        for (int i=10; i>0; i--) {
            System.out.println("value of i(thread): " + i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
