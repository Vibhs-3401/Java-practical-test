package com.company.aopdemo;

import java.util.Arrays;

public class ClassCaseExcp {

    public static void main(String[] args) {
        Object[] myObject = {
                new Integer(12),
                new String("foo"),
                new Integer(5),
                new Boolean(true)
        };

        Arrays.sort(myObject);  // ClassCaseException here, Array can not be converted to String

        for(int i=0; i<myObject.length; i++) {
            System.out.println(myObject[i].toString());
            System.out.println("   ");
        }
    }

}
