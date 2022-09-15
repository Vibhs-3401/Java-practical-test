package com.company.aopdemo.threads;

public class Company {

    int n;
    boolean flag = false;

    synchronized public void produceItem(int n){
        if(flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        this.n = n;
        System.out.println("Produced: " + this.n);
        flag = true;
        notify();
    }
    synchronized public int consumeItem(){
        if(!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Consumed: " + this.n);
        flag = false;
        notify();
        return this.n;
    }

    public static void main(String[] args) {

        Company company = new Company();
        Producer producer = new Producer(company);
        Consumer consumer = new Consumer(company);

        producer.start();
        consumer.start();
    }
}
