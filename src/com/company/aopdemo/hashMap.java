package com.company.aopdemo;

import java.util.HashMap;
import java.util.Map;

public class hashMap {

    public static void main(String args[]) {

//        Map<String, String> hashMap = new HashMap<String, String>();
        Map<Integer, String> hashMap = new HashMap<Integer, String>();

//        hashMap.put(new String("a"), "audi");
//        hashMap.put(new String("a"), "ferrari");

        hashMap.put(1, "audi");
        hashMap.put(1, "ferrari");
        System.out.println(hashMap);
    }
}
