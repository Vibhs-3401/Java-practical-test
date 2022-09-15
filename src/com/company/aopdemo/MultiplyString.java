package com.company.aopdemo;

public class MultiplyString {

    public String multiples(int n, String str) {
        String multiple = "";
        for(int i = 0; i < n; i++) {
            multiple += str;
        }
        return multiple;
    }
}
