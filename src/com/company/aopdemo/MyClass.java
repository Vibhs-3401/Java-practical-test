package com.company.aopdemo;

import java.util.Arrays;
import java.util.Comparator;

class Sort implements Comparator<Integer> {
    public int compare(Integer o1,  Integer o2)  {
//        if (o1 == o2) {
//            return 0;
//        }
//        else if (o1 < o2) {
//            return -1;
//        }
//        return 1;
        return o2.compareTo(o1);
    }
}
public class MyClass  {

    public static void main(String...a) {
        Integer  intArray[]={2,3,1};
        Arrays.sort(intArray, new Sort());
        for ( int  i:  intArray) {
            System.out.print( i+"   ");
        }
    }
}
