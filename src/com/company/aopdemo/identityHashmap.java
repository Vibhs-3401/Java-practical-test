package com.company.aopdemo;

import java.util.IdentityHashMap;
import java.util.Map;

public class identityHashmap {

    public static void main(String args[]) {
        Map<String, String> identityHashMap = new IdentityHashMap<String,String>();
        identityHashMap.put(new String("a"), "audi");
        identityHashMap.put(new String("a"), "ferrari");
        System.out.println(identityHashMap);
    }
}
