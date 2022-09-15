package com.company.aopdemo;

class Sup{

    public void Sup() {
        System.out.println("from method A...!, sup");
    }
}

class Sub extends Sup{

    @Override
    public void Sup() {
        System.out.println("Sup from sub");
    }

    public void Sub() {
        System.out.println("From method B....!, sub");
    }
}
public class extension {
    public static void main(String[] args) {
        Sup sup = new Sup();
        sup.Sup();

//        THIS IS CALL UPCASTING, CALLING SUB CLASS FROM SUPER CLASS
        Sup sub = new Sub();
        sub.Sup();
        Sub subSub = new Sub();
        subSub.Sub();
        subSub.Sup();
    }
}
