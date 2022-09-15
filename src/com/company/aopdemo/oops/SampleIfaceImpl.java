package com.company.aopdemo.oops;

public class SampleIfaceImpl implements SampleIface {

    public static String name = "Krupesh";
    @Override
    public void sayHello() {
//        name = "Sangita";
        System.out.println("Hello..." + name);
    }

    @Override
    public void sayGoodbye() {
        SampleIface.super.sayGoodbye();
        System.out.println("Good bye from implementation");
    }

    public static void main(String[] args) {
        SampleIfaceImpl sampleIfaceImpl = new SampleIfaceImpl();
        sampleIfaceImpl.sayHello();
        sampleIfaceImpl.sayGoodbye();

        SampleIface sampleIface = new SampleIfaceImpl();
        sampleIface.sayHello();
        sampleIface.sayGoodbye();
        SampleIface.printing();
    }
}
