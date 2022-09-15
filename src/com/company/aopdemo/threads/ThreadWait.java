package com.company.aopdemo.threads;

public class ThreadWait extends Thread{

    public static void main(String[] args) {
        GunFight gunFight = new GunFight();
        new Thread() {
            @Override
            public void run() {
                gunFight.fire(60);
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                gunFight.reload();
            }
        }.start();
    }
}

class GunFight {
    private int bullets = 40;

    synchronized public void fire(int bulletsToBeFired) {
        for(int i=1; i<= bulletsToBeFired; i++) {
            if(bullets == 0) {
                System.out.println(i-1 + " bullets fired and " + bullets + " remains");
                System.out.println("Invoking the wait method()");
                try {
                    wait();
                }catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("Continue the fire after reloading");
            }
            bullets--;
        }
        System.out.println("Firing process is complete");
    }

    synchronized public void reload() {
        System.out.println("Reloading the magazine and resuming the thread using notify()");
        bullets += 40;
        notify();
    }
}
